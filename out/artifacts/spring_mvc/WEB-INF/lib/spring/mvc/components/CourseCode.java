package spring.mvc.components;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    public String value() default "YKH";
    public String message() default "must start with YKH";

    //Default
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
