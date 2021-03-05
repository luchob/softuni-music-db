package bg.softuni.musicdb.model.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = FieldMatchValidator.class)
public @interface FieldMatch {

  String message() default "Fields should match";

  String first();
  String second();

  Class<?>[] groups() default { };
  Class<? extends Payload>[] payload() default { };
}
