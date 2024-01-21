package com.example.regauto.exception;

public class ValidationException extends RuntimeException {

    public ValidationException( final String message ) {
        super( message );
    }
}
