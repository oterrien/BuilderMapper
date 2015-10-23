package com.ote.util.builder;

import com.ote.util.builder.mapper.IEventMapper;
import com.ote.util.output.Event;

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
