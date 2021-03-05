package bg.softuni.musicdb.model.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {

  private String firstField;
  private String secondField;
  private String message;

  @Override
  public void initialize(FieldMatch constraintAnnotation) {
    this.firstField = constraintAnnotation.first();
    this.secondField = constraintAnnotation.second();
    this.message = constraintAnnotation.message();
  }

  @Override
  public boolean isValid(Object value, ConstraintValidatorContext context) {
    BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(value);

    Object firstFieldValue = beanWrapper.getPropertyValue(firstField);
    Object secondFieldValue = beanWrapper.getPropertyValue(secondField);

    boolean valid;

    if (firstFieldValue == null) {
      valid = secondFieldValue == null;
    } else {
      valid = firstFieldValue.equals(secondFieldValue);
    }

    if (!valid) {
      context.
          buildConstraintViolationWithTemplate(message).
            addPropertyNode(firstField).
            addConstraintViolation().
          buildConstraintViolationWithTemplate(message).
            addPropertyNode(secondField).
            addConstraintViolation().
          disableDefaultConstraintViolation();
    }

    return valid;
  }
}
