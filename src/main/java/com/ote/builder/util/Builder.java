package com.ote.builder.util;

/**
 * Created by Olivier on 23/10/2015.
 */
public abstract class Builder<TO, TM extends IMapper> implements IBuilder<TO, TM> {

    private TM mapper;

    public Builder(TM mapper) {
        this.mapper = mapper;
    }

    /**
     * Get the mapper
     *
     * @return the mapper
     */
    public final TM getMapper() {
        return mapper;
    }

    /**
     * Create an object with the given content (by using the mapper)
     * @param context
     * @return
     */
    public final TO build(IMapper.Context context) {

        TO obj = create();
        populate(obj, context);
        return obj;
    }

    /**
     * Populate object with mapper and use context
     *
     * @param obj
     * @param context
     */
    public final void populate(TO obj, IMapper.Context context) {
        mapper.setContext(context);
        populate(obj, mapper);
    }

    protected abstract TO create();

    protected abstract void populate(TO obj, TM mapper);
}

