package com.Galaksiya.ws.unique_username;




import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {UniqueUsernameValidator.class} )
public @interface UniqueUsername {
    String message() default "{Galaksiya.constraint.username.UniqueUsername.message}";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default {};
}
