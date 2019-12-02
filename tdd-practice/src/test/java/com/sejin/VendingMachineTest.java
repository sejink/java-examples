package com.sejin;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VendingMachineTest {

    @Test
    @DisplayName("Insert coin and verify change")
    void testGetChangeAmount() {
        //given
        VendingMachine vendingMachine = new VendingMachine();

        //when
        vendingMachine.putCoin(100);

        //then
        assertThat(vendingMachine.getChangeAmount()).isEqualTo(100);

        //when
        vendingMachine.putCoin(500);

        //then
        assertThat(vendingMachine.getChangeAmount()).isEqualTo(600);
    }

}
