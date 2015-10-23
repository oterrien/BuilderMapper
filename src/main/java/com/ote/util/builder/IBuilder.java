package com.ote.util.builder;

/**
 * Created by Olivier on 23/10/2015.
 */
public interface IBuilder<TO, TM extends IMapper> {

    TO build(IMapperContext context);

    void populate(TO obj, IMapperContext context);

    TM getMapper();
}
