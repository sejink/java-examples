package com.sejin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EnumTests {

    @Test
    void basicEnumTest() {
        OrderState orderState = OrderState.PAYMENT_WAITING;
        assertThat(OrderState.valueOf("PAYMENT_WAITING")).isEqualTo(orderState);
    }
}
