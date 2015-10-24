package com.ote.util.builder.mapper;

import com.ote.builder.util.IMapper;
import com.ote.util.output.Event;

/**
 * Created by Olivier on 23/10/2015.
 */
public interface IMessageMapper extends IMapper {

    int getId();

    Event getEvent();
}
