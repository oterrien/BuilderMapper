package com.ote.util.builder.mapper.payment;

import com.ote.util.builder.EventBuilder;
import com.ote.util.builder.IMapperContext;
import com.ote.util.builder.Mapper;
import com.ote.util.builder.mapper.IMessageMapper;
import com.ote.util.input.Payment;
import com.ote.util.output.Event;

/**
 * Created by Olivier on 23/10/2015.
 */
public class PaymentMessageMapper extends Mapper<PaymentMessageMapper.Context> implements IMessageMapper {

    public int getId() {
        return getMapperContext().count();
    }

    private EventBuilder eventBuilder = null;

    public Event getEvent() {

        if (eventBuilder == null) {
            eventBuilder = new EventBuilder(new PaymentEventMapper());
        }

        PaymentEventMapper.Context context = new PaymentEventMapper.Context();
        context.setPayment(getMapperContext().getPayment());
        return eventBuilder.build(context);
    }

    public static class Context implements IMapperContext{

        private Payment payment;

        public Payment getPayment() {
            return payment;
        }

        public void setPayment(Payment payment) {
            this.payment = payment;
        }

        public int count() {
            return Payment.getCount();
        }
    }
}
