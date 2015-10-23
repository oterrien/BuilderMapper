package com.ote.util.builder;

/**
 * Created by Olivier on 23/10/2015.
 */
public abstract class Mapper<TC extends IMapperContext> implements IMapper {

    private TC mapperContext;

    public final TC getMapperContext() {
        return this.mapperContext;
    }

    public final void setMapperContext(IMapperContext context) {
        this.mapperContext = (TC) context;
    }

    public void close() {
        mapperContext = null;
    }
}