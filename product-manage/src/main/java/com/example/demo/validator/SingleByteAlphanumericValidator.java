package com.example.demo.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;

@Documented
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Constraint(validatedBy = {})
@Pattern(regexp = "^[0-9a-zA-Z]+$")
public @interface SingleByteAlphanumericValidator {

  /**
   * Message.
   *
   * @return the string
   */
  String message() default "mismatch IP address pattern";

  /**
   * Groups.
   *
   * @return the class[]
   */
  Class<?>[] groups() default {};

  /**
   * Payload.
   *
   * @return the class<? extends payload>[]
   */
  Class<? extends Payload>[] payload() default {};

}
