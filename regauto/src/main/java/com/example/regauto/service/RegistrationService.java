package com.example.regauto.service;

import com.example.regauto.dto.CarResource;
import com.example.regauto.dto.RegistrationRequest;
import com.example.regauto.model.Car;
import com.example.regauto.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

@RequiredArgsConstructor
@Service
public class RegistrationService {

    private final CarRepository carRepository;

    public void save( RegistrationRequest registrationRequest ) {
        carRepository.save( Car
                                .builder()
                                .id( UUID
                                         .randomUUID()
                                         .toString() )
                                .ownerName( registrationRequest
                                                .getOwnerName()
                                                .get() )
                                .ownerSurname( registrationRequest
                                                   .getOwnerSurname()
                                                   .get() )
                                .plate( registrationRequest
                                            .getPlate()
                                            .get() )
                                .build() );
    }

    public List<CarResource> find( String plate ) {
        List<CarResource> carResourceList = new ArrayList<>();
        if ( plate == null || plate.isEmpty() ) {
            carRepository
                .findAll()
                .forEach( addCarsToList( carResourceList ) );
            return carResourceList;
        }

        carRepository
            .findByPlate( plate )
            .forEach( addCarsToList( carResourceList ) );

        return carResourceList;
    }

    private static Consumer<Car> addCarsToList( final List<CarResource> carResourceList ) {
        return c -> carResourceList.add( CarResource
                                             .builder()
                                             .ownerName( c.getOwnerName() )
                                             .ownerSurname( c.getOwnerSurname() )
                                             .plate( c.getPlate() )
                                             .build() );
    }

}
