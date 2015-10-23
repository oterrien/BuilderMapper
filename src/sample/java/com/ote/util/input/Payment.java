package com.ote.util.input;

/**
 * Created by Olivier on 23/10/2015.
 */
public class Payment {

    private static int count = 0;

    private String counterpart;
    private double amount;
    private String currency;

    public Payment() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Payment.count = count;
    }

    public String getCounterpart() {
        return counterpart;
    }

    public void setCounterpart(String counterpart) {
        this.counterpart = counterpart;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
