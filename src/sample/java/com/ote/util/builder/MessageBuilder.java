package com.ote.util.builder;

import com.ote.util.builder.mapper.IMessageMapper;
import com.ote.util.output.Message;

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
