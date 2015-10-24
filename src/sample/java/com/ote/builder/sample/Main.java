package com.ote.builder.sample;

import com.ote.builder.sample.builder.MessageBuilder;
import com.ote.builder.sample.output.Message;
import com.ote.builder.sample.builder.mapper.payment.PaymentMessageMapper;
import com.ote.builder.sample.builder.mapper.trade.TradeMessageMapper;
import com.ote.builder.sample.input.Payment;
import com.ote.builder.sample.input.Trade;

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

        MessageBuilder messageBuilder = new MessageBuilder(new TradeMessageMapper());

        TradeMessageMapper.Context context = new TradeMessageMapper.Context();
        context.setTrade(trade);
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

        MessageBuilder messageBuilder = new MessageBuilder(new PaymentMessageMapper());

        PaymentMessageMapper.Context context = new PaymentMessageMapper.Context();
        context.setPayment(payment);
        Message message = messageBuilder.build(context);

        System.out.println(message.getId());
        System.out.println(message.getEvent().getType());
        System.out.println(message.getEvent().getContent());

        payment = new Payment();
        payment.setCounterpart("HDFFX1554");
        payment.setAmount(-200);
        payment.setCurrency("EUR");

        // Reuse Builder with updated context
        context.setPayment(payment);
        message = messageBuilder.build(context);

        System.out.println(message.getId());
        System.out.println(message.getEvent().getType());
        System.out.println(message.getEvent().getContent());

    }
}
