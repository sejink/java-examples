package com.sejin.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    @Test
    @DisplayName("1+1=2")
    void addsTwoNumber() {
        Calculator calculator = new Calculator();

        //junit assertion
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");

        //assertJ assertion
        assertThat(calculator.add(1, 1)).as("1 + 1 should equal 2").isEqualTo(2);
    }

}
