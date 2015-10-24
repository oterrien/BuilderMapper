package com.ote.builder.sample.builder.mapper.trade;

import com.ote.builder.sample.builder.mapper.IEventMapper;
import com.ote.builder.sample.input.Trade;
import com.ote.builder.util.IMapper;
import com.ote.builder.util.Mapper;

import java.text.MessageFormat;

/**
 * Created by Olivier on 23/10/2015.
 */
public class TradeEventMapper extends Mapper<TradeEventMapper.Context> implements IEventMapper {

    private static final String ContentTemplate = "A trade has been signed between us and {0} for the amount of {1,number,#.00} {2}";

    public String getContent() {

        return MessageFormat.format(ContentTemplate,
                getMapperContext().getTrade().getCounterpart(),
                getMapperContext().getTrade().getAmount(),
                getMapperContext().getTrade().getCurrency());
    }

    public String getType() {
        return "Trade";
    }

    /**
     * Context for TradeEventMapper
     */
    public static class Context implements IMapper.Context{

        private Trade trade;

        public Trade getTrade() {
            return trade;
        }

        public void setTrade(Trade trade) {
            this.trade = trade;
        }
    }
}
