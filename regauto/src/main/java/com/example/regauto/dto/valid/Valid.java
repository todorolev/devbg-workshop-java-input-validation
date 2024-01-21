package com.example.regauto.dto.valid;

public abstract class Valid<T> {

    private final T value;

    protected Valid(T value) {
        validate( value );
        this.value = value;
    }

    public final T get( ) {
        return this.value;
    }

    protected abstract void validate( T value );
}
