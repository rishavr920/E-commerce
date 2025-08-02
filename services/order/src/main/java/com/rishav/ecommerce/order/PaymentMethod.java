package com.rishav.ecommerce.order;

public enum PaymentMethod {
    PAYPAL("PayPal"),
    PAYTM("Paytm"),
    PHONEPE("PhonePe"),
    CREDIT_CARD("Credit Card"),
    VISA("Visa"),
    MASTER_CARD("MasterCard"),
    BITCOIN("Bitcoin");

    private final String displayName;

    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
