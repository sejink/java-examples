package com.sejin;

public enum OrderState {
    PAYMENT_WAITING (1) {
        public boolean isShippingChangeable() {
            return true;
        }
    },
    SHIPPED (2);

    private int state;

    OrderState(int state) {
        this.state = state;
    }

    public int getState() {
        return this.state;
    }

    public boolean isShippingChangeable() {
        return false;
    }

    public String toString() {
       return String.valueOf(state);
    }
}
