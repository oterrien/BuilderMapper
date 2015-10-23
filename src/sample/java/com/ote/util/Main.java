package com.ote.util;

import com.ote.util.builder.MessageBuilder;
import com.ote.util.builder.mapper.payment.PaymentMessageMapper;
import com.ote.util.builder.mapper.trade.TradeMessageMapper;
import com.ote.util.input.Payment;
import com.ote.util.input.Trade;
import com.ote.util.output.Message;

/**
 * Created by Olivier on 23/10/2015.
 */
public class Main {

    public static void main(String... args) throws Exception {

        testTrade();
        testPayment();
    }

    private static void testTrade() {

        Trade trade = new Trade();
        trade.setBook("DELTA");
        trade.setCounterpart("HDFFX1554");
        trade.setAmount(114003.51);
        trade.setCurrency("EUR");
        trade.setUnderlying("CAC40");

        TradeMessageMapper.Context context = new TradeMessageMapper.Context();
        context.setTrade(trade);

        MessageBuilder messageBuilder = new MessageBuilder(new TradeMessageMapper());
        Message message = messageBuilder.build(context);

        System.out.println(message.getId());
        System.out.println(message.getEvent().getType());
        System.out.println(message.getEvent().getContent());
    }

    private static void testPayment() {

        Payment payment = new Payment();
        payment.setCounterpart("HDFFX1554");
        payment.setAmount(100);
        payment.setCurrency("EUR");

        PaymentMessageMapper.Context context = new PaymentMessageMapper.Context();
        context.setPayment(payment);

        MessageBuilder messageBuilder = new MessageBuilder(new PaymentMessageMapper());
        Message message = messageBuilder.build(context);

        System.out.println(message.getId());
        System.out.println(message.getEvent().getType());
        System.out.println(message.getEvent().getContent());

        payment = new Payment();
        payment.setCounterpart("HDFFX1554");
        payment.setAmount(-200);
        payment.setCurrency("EUR");

        context = new PaymentMessageMapper.Context();
        context.setPayment(payment);

        message = messageBuilder.build(context);

        System.out.println(message.getId());
        System.out.println(message.getEvent().getType());
        System.out.println(message.getEvent().getContent());

    }
}
