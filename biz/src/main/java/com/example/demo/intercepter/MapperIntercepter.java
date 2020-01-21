package com.example.demo.intercepter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

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
public class MapperIntercepter {

	private final AccountService accountService;

	@Before("execution(* com.example.demo.repository.*Mapper.insert*(..)) || " +
			"execution(* com.example.demo.repository.*Mapper.update*(..))")
	public void setCommonInformations(JoinPoint jp) throws Throwable {

		// Mapperのメソッド名を取得
		MethodSignature signature = (MethodSignature) jp.getSignature();
		Method method = signature.getMethod();
		String methodName = method.getName();

		// 現在日時の取得
		LocalDateTime localDateTimeNowUtc = LocalDateTime.now(ZoneOffset.UTC);

		// Mapperの第一引数（モデルオブジェクト）を取得
		Object[] args = jp.getArgs();
		Object dto = args[0];

		// create*メソッドは作成者・作成日時・更新者・更新日時をセット
		if (methodName.startsWith("insert")) {
			setEnterInformations(accountService.getUserName(), localDateTimeNowUtc, dto);
			setUpdateInformations(accountService.getUserName(), localDateTimeNowUtc, dto);
			// update*メソッドは更新者・更新日時をセット
		} else if (methodName.startsWith("update")) {
			setUpdateInformations(accountService.getUserName(), localDateTimeNowUtc, dto);
		}

	}

	private void setEnterInformations(String userName, LocalDateTime utcLocalDateTimeNow, Object dto)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// Mapperの引数にsetCreatedByIdメソッドがある場合、認証情報をセット
		Method setEnterUser = ReflectionUtils.findMethod(dto.getClass(), "setEnterUser", String.class);
		if (setEnterUser != null) {
			setEnterUser.invoke(dto, userName);
		}

		// Mapperの引数にsetCreatedTimestampメソッドがある場合、現在日時をセット
		Method setEnterDate = ReflectionUtils.findMethod(dto.getClass(), "setEnterDate", LocalDateTime.class);
		if (setEnterDate != null) {
			setEnterDate.invoke(dto, utcLocalDateTimeNow);
		}

	}

	private void setUpdateInformations(String userName, LocalDateTime utcLocalDateTimeNow, Object dto)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// Mapperの引数にsetCreatedByIdメソッドがある場合、認証情報をセット
		Method setUpdateUser = ReflectionUtils.findMethod(dto.getClass(), "setUpdateUser", String.class);
		if (setUpdateUser != null) {
			setUpdateUser.invoke(dto, userName);
		}

		// Mapperの引数にsetCreatedTimestampメソッドがある場合、現在日時をセット
		Method setUpdateDate = ReflectionUtils.findMethod(dto.getClass(), "setUpdateDate", LocalDateTime.class);
		if (setUpdateDate != null) {
			setUpdateDate.invoke(dto, utcLocalDateTimeNow);
		}

	}

}
