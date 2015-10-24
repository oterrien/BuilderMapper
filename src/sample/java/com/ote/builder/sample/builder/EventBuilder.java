package com.ote.builder.sample.builder;

import com.ote.builder.util.Builder;
import com.ote.builder.sample.builder.mapper.IEventMapper;
import com.ote.builder.sample.output.Event;

/**
 * Created by Olivier on 23/10/2015.
 */
public class EventBuilder extends Builder<Event, IEventMapper> {

    public EventBuilder(IEventMapper mapper) {
        super(mapper);
    }

    @Override
    protected Event create() {
        return new Event();
    }

    @Override
    protected void populate(Event obj, IEventMapper mapper) {

        obj.setType(mapper.getType());
        obj.setContent(mapper.getContent());
    }
}
