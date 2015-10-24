package com.ote.builder.util;

/**
 * Created by Olivier on 23/10/2015.
 */
public class Mapper<TC extends IMapper.Context> implements IMapper {

    private TC context;

    @Override
    public final TC getContext() {
        return this.context;
    }

    @Override
    public final void setContext(IMapper.Context context) {
        this.context = (TC) context;
    }
}