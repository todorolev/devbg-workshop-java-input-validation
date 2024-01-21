package com.example.regauto.exception;

import com.example.regauto.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RegautoExceptionHandler {

    @ExceptionHandler ( ValidationException.class )
    public ResponseEntity<ErrorResponse> handleValidationException( final ValidationException ex ) {
        return new ResponseEntity<>( new ErrorResponse("Validation error"),
                                     HttpStatus.BAD_REQUEST );
    }
}
