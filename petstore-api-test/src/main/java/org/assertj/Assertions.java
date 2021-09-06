package org.assertj;

/**
 * Entry point for assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class Assertions {

  /**
   * Creates a new instance of <code>{@link io.petstore.test.oas.client.model.ModelApiResponseAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static io.petstore.test.oas.assertions.ModelApiResponseAssert assertThat(io.petstore.test.oas.client.model.ModelApiResponse actual) {
    return new io.petstore.test.oas.assertions.ModelApiResponseAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link io.petstore.test.oas.client.model.OrderAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static io.petstore.test.oas.assertions.OrderAssert assertThat(io.petstore.test.oas.client.model.Order actual) {
    return new io.petstore.test.oas.assertions.OrderAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link io.petstore.test.oas.client.model.OrderStatusEnumAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static io.petstore.test.oas.assertions.OrderStatusEnumAssert assertThat(io.petstore.test.oas.client.model.Order.StatusEnum actual) {
    return new io.petstore.test.oas.assertions.OrderStatusEnumAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link io.petstore.test.oas.client.model.OrderStatusEnumAdapterAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static io.petstore.test.oas.assertions.OrderStatusEnumAdapterAssert assertThat(io.petstore.test.oas.client.model.Order.StatusEnum.Adapter actual) {
    return new io.petstore.test.oas.assertions.OrderStatusEnumAdapterAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link io.petstore.test.oas.client.model.PetAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static io.petstore.test.oas.assertions.PetAssert assertThat(io.petstore.test.oas.client.model.Pet actual) {
    return new io.petstore.test.oas.assertions.PetAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link io.petstore.test.oas.client.model.PetStatusEnumAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static io.petstore.test.oas.assertions.PetStatusEnumAssert assertThat(io.petstore.test.oas.client.model.Pet.StatusEnum actual) {
    return new io.petstore.test.oas.assertions.PetStatusEnumAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link io.petstore.test.oas.client.model.PetStatusEnumAdapterAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static io.petstore.test.oas.assertions.PetStatusEnumAdapterAssert assertThat(io.petstore.test.oas.client.model.Pet.StatusEnum.Adapter actual) {
    return new io.petstore.test.oas.assertions.PetStatusEnumAdapterAssert(actual);
  }

  /**

  /**
   * Creates a new <code>{@link Assertions}</code>.
   */
  protected Assertions() {
    // empty
  }
}
