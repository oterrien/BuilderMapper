package com.ote.builder.util;

import java.util.function.Supplier;

/**
 * Created by Olivier on 23/10/2015.
 */
public interface IMapper extends Supplier<IMapper.Context> {

    void set(IMapper.Context context);

    interface Context {
    }
}
