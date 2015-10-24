package com.ote.builder.sample.builder.mapper;

import com.ote.builder.util.IMapper;
import com.ote.builder.sample.output.Event;

/**
 * Created by Olivier on 23/10/2015.
 */
public interface IMessageMapper extends IMapper {

    int getId();

    Event getEvent();
}
