package com.ote.util.builder.mapper.payment;

import com.ote.util.builder.IMapperContext;
import com.ote.util.builder.Mapper;
import com.ote.util.builder.mapper.IEventMapper;
import com.ote.util.input.Payment;

import java.text.MessageFormat;

/**
 * Created by Olivier on 23/10/2015.
 */
public class PaymentEventMapper extends Mapper<PaymentEventMapper.Context> implements IEventMapper {

    private static final String ContentTemplate = "{0} {1, number} {2}";

    public String getContent() {

        return MessageFormat.format(ContentTemplate,
                getMapperContext().getPayment().getAmount() > 0 ? "Paying" : "Receiving",
                Math.abs(getMapperContext().getPayment().getAmount()),
                getMapperContext().getPayment().getCurrency());
    }

    public String getType() {
        return "Payment";
    }

    public static class Context implements IMapperContext {

        private Payment payment;

        public Payment getPayment() {
            return payment;
        }

        public void setPayment(Payment payment) {
            this.payment = payment;
        }
    }
}
