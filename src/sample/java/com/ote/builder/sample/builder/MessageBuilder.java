package com.ote.builder.sample.builder;

import com.ote.builder.util.Builder;
import com.ote.builder.sample.builder.mapper.IMessageMapper;
import com.ote.builder.sample.output.Message;

/**
 * Created by Olivier on 23/10/2015.
 */
public class MessageBuilder extends Builder<Message, IMessageMapper> {

    public MessageBuilder(IMessageMapper mapper) {
        super(mapper);
    }

    @Override
    protected Message create() {
        return new Message();
    }

    @Override
    protected void populate(Message obj, IMessageMapper mapper) {

        obj.setId(mapper.getId());
        obj.setEvent(mapper.getEvent());
    }
}
