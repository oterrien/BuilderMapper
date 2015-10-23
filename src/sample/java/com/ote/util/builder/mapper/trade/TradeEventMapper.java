package com.ote.util.builder.mapper.trade;

import com.ote.util.builder.IMapperContext;
import com.ote.util.builder.Mapper;
import com.ote.util.builder.mapper.IEventMapper;
import com.ote.util.input.Trade;

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

    public static class Context implements IMapperContext{

        private Trade trade;

        public Trade getTrade() {
            return trade;
        }

        public void setTrade(Trade trade) {
            this.trade = trade;
        }
    }
}