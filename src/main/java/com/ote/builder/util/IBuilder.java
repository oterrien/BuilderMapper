package com.ote.builder.util;

/**
 * Created by Olivier on 23/10/2015.
 */
public interface IBuilder<TO, TM extends IMapper> {

    TO build(IMapper.Context context);

    void populate(TO obj, IMapper.Context context);

    TM getMapper();
}
