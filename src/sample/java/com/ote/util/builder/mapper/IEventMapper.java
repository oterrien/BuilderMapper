package com.ote.util.builder.mapper;

import com.ote.util.builder.IMapper;

/**
 * Created by Olivier on 23/10/2015.
 */
public interface IEventMapper extends IMapper {

    String getType();

    String getContent();
}
