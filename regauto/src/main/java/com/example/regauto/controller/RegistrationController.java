package com.example.regauto.controller;

import com.example.regauto.dto.CarResource;
import com.example.regauto.dto.RegistrationRequest;
import com.example.regauto.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ( "car" )
@RequiredArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping
    public ResponseEntity<Void> car( @RequestBody RegistrationRequest registrationRequest ) {
        registrationService.save( registrationRequest );
        return new ResponseEntity<>( HttpStatus.CREATED );
    }

    @GetMapping
    public ResponseEntity<List<CarResource>> findCars( @RequestParam ( required = false ) String plate ) {
        return new ResponseEntity<>( registrationService.find( plate ),
                                     HttpStatus.OK );
    }
}
