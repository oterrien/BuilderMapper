package com.ote.util.builder;

/**
 * Created by Olivier on 23/10/2015.
 */
public interface IMapper {

    IMapperContext getMapperContext();

    void setMapperContext(IMapperContext context);

    void close();
}
