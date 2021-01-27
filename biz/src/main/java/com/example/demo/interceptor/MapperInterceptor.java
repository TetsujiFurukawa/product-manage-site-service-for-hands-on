package com.example.demo.interceptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Objects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import com.example.demo.service.AccountService;

import lombok.RequiredArgsConstructor;

@Aspect
@Component
@RequiredArgsConstructor
public class MapperInterceptor {

  private static final String CONST_INSERT = "insert";
  private static final String CONST_UPDATE = "update";
  private static final String CONST_SET_ENTER_USER = "setEnterUser";
  private static final String CONST_SET_ENTER_DATE = "setEnterDate";
  private static final String CONST_SET_UPDATE_USER = "setUpdateUser";
  private static final String CONST_SET_UPDATE_DATE = "setUpdateDate";

  private final AccountService accountService;

  /**
   * Sets the common informations.
   *
   * @param joinPoint the new common informations
   * @throws IllegalAccessException the illegal access exception
   * @throws IllegalArgumentException the illegal argument exception
   * @throws InvocationTargetException the invocation target exception
   */
  @Before("execution(* com.example.demo.repository.*Mapper.insert*(..)) || "
      + "execution(* com.example.demo.repository.*Mapper.update*(..))")
  public void setCommonInformations(JoinPoint joinPoint)
      throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

    // Gets method name of Mapper.
    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
    Method method = methodSignature.getMethod();
    String methodName = method.getName();

    // Gets the current date and time.
    LocalDateTime localDateTimeNowUtc = LocalDateTime.now(ZoneOffset.UTC);

    // Get the first argument of Mapper.
    Object[] args = joinPoint.getArgs();
    Object dto = args[0];

    if (methodName.startsWith(CONST_INSERT)) {
      // In case of insert, sets enter user and date time / sets update user and date time.
      setupEnterInformations(accountService.getUserName(), localDateTimeNowUtc, dto);
      setupUpdateInformations(accountService.getUserName(), localDateTimeNowUtc, dto);

    } else if (methodName.startsWith(CONST_UPDATE)) {
      // In case of update, sets update user and date time.
      setupUpdateInformations(accountService.getUserName(), localDateTimeNowUtc, dto);
    }

  }

  private void setupEnterInformations(String userName, LocalDateTime utcLocalDateTimeNow,
      Object dto)
      throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

    Method setEnterUserMethod = ReflectionUtils.findMethod(dto.getClass(), CONST_SET_ENTER_USER,
        String.class);

    if (Objects.nonNull(setEnterUserMethod)) {
      setEnterUserMethod.invoke(dto, userName);
    }

    Method setEnterDateMethod = ReflectionUtils.findMethod(dto.getClass(), CONST_SET_ENTER_DATE,
        LocalDateTime.class);
    if (Objects.nonNull(setEnterDateMethod)) {
      setEnterDateMethod.invoke(dto, utcLocalDateTimeNow);
    }

  }

  private void setupUpdateInformations(String userName, LocalDateTime utcLocalDateTimeNow,
      Object dto)
      throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

    Method setUpdateUserMethod = ReflectionUtils.findMethod(dto.getClass(), CONST_SET_UPDATE_USER,
        String.class);
    if (Objects.nonNull(setUpdateUserMethod)) {
      setUpdateUserMethod.invoke(dto, userName);
    }

    Method setUpdateDateMethod = ReflectionUtils.findMethod(dto.getClass(), CONST_SET_UPDATE_DATE,
        LocalDateTime.class);
    if (Objects.nonNull(setUpdateDateMethod)) {
      setUpdateDateMethod.invoke(dto, utcLocalDateTimeNow);
    }

  }

}
