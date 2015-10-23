package com.ote.util.builder;

/**
 * Created by Olivier on 23/10/2015.
 */
public abstract class Builder<TO, TM extends IMapper> implements
        IBuilder<TO, TM> {

    private TM mapper;

    public Builder(TM mapper) {
        this.mapper = mapper;
    }

    public final TM getMapper() {
        return mapper;
    }

    public final TO build(IMapperContext context) {

        TO obj = create();
        populate(obj, context);
        return obj;
    }

    public final void populate(TO obj, IMapperContext context) {
        try {
            mapper.setMapperContext(context);
            populate(obj, mapper);
        } finally {
            mapper.close();
        }
    }

    protected abstract TO create();

    protected abstract void populate(TO obj, TM mapper);
}

