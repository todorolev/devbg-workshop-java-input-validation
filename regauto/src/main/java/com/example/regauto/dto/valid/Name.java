package com.example.regauto.dto.valid;

import com.example.regauto.exception.ValidationException;

public class Name extends Valid<String> {

    public Name( String value ) {
        super( value );
    }

    @Override
    public void validate( final String value ) {
        if ( value == null ) {
            throw new ValidationException( "Name is null or empty." );
        }

        for ( int i = 0; i < value.length(); i++ ) {
            char c = value.charAt( i );
            if ( Character.isLetter( c ) ) {
                continue;
            }
            throw new ValidationException( "Name not valid" );
        }
    }
}
