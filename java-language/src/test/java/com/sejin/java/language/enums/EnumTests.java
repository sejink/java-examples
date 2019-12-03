package com.sejin.java.language.enums;

import org.junit.jupiter.api.Test;

import static com.sejin.java.language.enums.OrderState.PAYMENT_WAITING;
import static com.sejin.java.language.enums.OrderState.SHIPPED;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class EnumTests {

    @Test
    void basicEnumTest() {
        OrderState orderState = OrderState.PAYMENT_WAITING;
        assertThat(OrderState.valueOf("PAYMENT_WAITING")).isEqualTo(orderState);
    }

    @Test
    void compareEnumTypesWithOperator() {
        OrderState orderState = OrderState.PAYMENT_WAITING;
        assertThat(PAYMENT_WAITING == orderState).isTrue();
        assertThat(PAYMENT_WAITING.equals(orderState)).isTrue();
        assertThat(PAYMENT_WAITING == OrderState.SHIPPED).isFalse();
    }

    @Test
    void customEnumMember() {
        assertThat(PAYMENT_WAITING.getState()).isEqualTo(1);
        assertThat(PAYMENT_WAITING.isShippingChangeable()).isTrue();
        assertThat(SHIPPED.isShippingChangeable()).isFalse();
    }

    @Test
    void overridingToString() {
        assertThat(PAYMENT_WAITING.toString()).isEqualTo("1");
    }

    @Test
    void throwException() {
        assertThatThrownBy(() -> {
            OrderState.valueOf("NONE_EXIST_CONST");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
