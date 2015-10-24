package com.ote.builder.sample.builder.mapper.payment;

import com.ote.builder.util.IMapper;
import com.ote.builder.util.Mapper;
import com.ote.builder.sample.builder.mapper.IEventMapper;
import com.ote.builder.sample.input.Payment;

import java.text.MessageFormat;

/**
 * Created by Olivier on 23/10/2015.
 */
public class PaymentEventMapper extends Mapper<PaymentEventMapper.Context> implements IEventMapper {

    private static final String ContentTemplate = "{0} {1, number} {2}";

    public String getContent() {

        return MessageFormat.format(ContentTemplate,
                getContext().getPayment().getAmount() > 0 ? "Paying" : "Receiving",
                Math.abs(getContext().getPayment().getAmount()),
                getContext().getPayment().getCurrency());
    }

    public String getType() {
        return "Payment";
    }

    /**
     * Context for PaymentEventMapper
     */
    public static class Context implements IMapper.Context{

        private Payment payment;

        public Payment getPayment() {
            return payment;
        }

        public void setPayment(Payment payment) {
            this.payment = payment;
        }
    }
}
