package com.ote.util.builder;

/**
 * Created by Olivier on 23/10/2015.
 */
public abstract class Mapper<TC extends IMapper.Context> implements IMapper {

    private TC mapperContext;

    public final TC getMapperContext() {
        return this.mapperContext;
    }

    public final void setMapperContext(IMapper.Context context) {
        this.mapperContext = (TC) context;
    }
}