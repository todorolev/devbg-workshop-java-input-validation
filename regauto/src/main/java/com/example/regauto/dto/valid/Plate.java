package com.example.regauto.dto.valid;

import com.example.regauto.exception.ValidationException;

public class Plate extends Valid<String> {

    public Plate( final String value ) {
        super(value);
    }

    @Override
    public void validate( final String value ) {
        if ( value == null ) {
            throw new ValidationException( "Plate number is null or empty." );
        }

        for ( int i = 0; i < value.length(); i++ ) {
            char c = value.charAt( i );
            if ( Character.isLetterOrDigit( c ) ) {
                continue;
            }
            throw new ValidationException( "Plate number not valid" );
        }
    }
}
