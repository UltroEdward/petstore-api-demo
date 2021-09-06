package io.petstore.test.oas.assertions;

import io.petstore.test.oas.client.model.Order;

/**
 * {@link Order.StatusEnum} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractOrderStatusEnumAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class OrderStatusEnumAssert extends AbstractOrderStatusEnumAssert<OrderStatusEnumAssert, Order.StatusEnum> {

  /**
   * Creates a new <code>{@link OrderStatusEnumAssert}</code> to make assertions on actual Order.StatusEnum.
   * @param actual the Order.StatusEnum we want to make assertions on.
   */
  public OrderStatusEnumAssert(Order.StatusEnum actual) {
    super(actual, OrderStatusEnumAssert.class);
  }

  /**
   * An entry point for OrderStatusEnumAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myOrder.StatusEnum)</code> and get specific assertion with code completion.
   * @param actual the Order.StatusEnum we want to make assertions on.
   * @return a new <code>{@link OrderStatusEnumAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static OrderStatusEnumAssert assertThat(Order.StatusEnum actual) {
    return new OrderStatusEnumAssert(actual);
  }
}