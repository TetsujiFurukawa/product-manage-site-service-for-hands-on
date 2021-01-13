package com.example.demo.validator;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

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
@Pattern(regexp = "^[A-Z]+$")
public @interface SingleByteAlphaUpperValidator {

	/**
	 * message
	 *
	 * @return error message
	 */
	String message() default "mismatch pattern";

	/**
	 * groups
	 *
	 * @return groups
	 */
	Class<?>[] groups() default {};

	/**
	 * payload
	 *
	 * @return payload
	 */
	Class<? extends Payload>[] payload() default {};

}
