package com.ote.util.input;

/**
 * Created by Olivier on 23/10/2015.
 */
public class Trade {

    private static int count = 0;

    private String book;
    private String counterpart;
    private double amount;
    private String currency;
    private String underlying;

    public Trade() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
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

    public String getUnderlying() {
        return underlying;
    }

    public void setUnderlying(String underlying) {
        this.underlying = underlying;
    }
}
