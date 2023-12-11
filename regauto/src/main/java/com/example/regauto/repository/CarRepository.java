package com.example.regauto.repository;

import com.example.regauto.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, String> {

    List<Car> findByPlate( String plate );
}
