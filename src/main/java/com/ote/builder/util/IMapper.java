package com.ote.builder.util;

/**
 * Created by Olivier on 23/10/2015.
 */
public interface IMapper {

    IMapper.Context getMapperContext();

    void setMapperContext(IMapper.Context context);

    interface Context{}
}
