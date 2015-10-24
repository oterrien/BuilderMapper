package com.ote.builder.sample.builder.mapper.trade;

import com.ote.builder.sample.builder.EventBuilder;
import com.ote.builder.sample.builder.mapper.IMessageMapper;
import com.ote.builder.sample.input.Trade;
import com.ote.builder.sample.output.Event;
import com.ote.builder.util.IMapper;
import com.ote.builder.util.Mapper;

/**
 * Created by Olivier on 23/10/2015.
 */
public class TradeMessageMapper extends Mapper<TradeMessageMapper.Context> implements IMessageMapper {

    public int getId() {
        return getMapperContext().count();
    }

    private EventBuilder eventBuilder = null;

    public Event getEvent() {

        if (eventBuilder == null) {
            eventBuilder = new EventBuilder(new TradeEventMapper());
        }

        TradeEventMapper.Context context = new TradeEventMapper.Context();
        context.setTrade(getMapperContext().getTrade());
        return eventBuilder.build(context);
    }

    /**
     * Context for TradeMessageMapper
     */
    public static class Context implements IMapper.Context {

        private Trade trade;

        public Trade getTrade() {
            return trade;
        }

        public void setTrade(Trade trade) {
            this.trade = trade;
        }

        public int count() {
            return Trade.getCount();
        }
    }
}
