package io.petstore.test.oas.assertions;

import io.petstore.test.oas.client.model.Order;
import org.assertj.core.api.AbstractComparableAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link Order.StatusEnum} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractOrderStatusEnumAssert<S extends AbstractOrderStatusEnumAssert<S, A>, A extends Order.StatusEnum> extends AbstractComparableAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractOrderStatusEnumAssert}</code> to make assertions on actual Order.StatusEnum.
   * @param actual the Order.StatusEnum we want to make assertions on.
   */
  protected AbstractOrderStatusEnumAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual Order.StatusEnum's value is equal to the given one.
   * @param value the given value to compare the actual Order.StatusEnum's value to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Order.StatusEnum's value is not equal to the given one.
   */
  public S hasValue(String value) {
    // check that actual Order.StatusEnum we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting value of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualValue = actual.getValue();
    if (!Objects.areEqual(actualValue, value)) {
      failWithMessage(assertjErrorMessage, actual, value, actualValue);
    }

    // return the current assertion for method chaining
    return myself;
  }

}