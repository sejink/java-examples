package com.sejin;

public class VendingMachine {
    private int changeAmount;

    public int getChangeAmount() {
        return this.changeAmount;
    }

    public void putCoin(int i) {
       this.changeAmount += i;
    }
}
