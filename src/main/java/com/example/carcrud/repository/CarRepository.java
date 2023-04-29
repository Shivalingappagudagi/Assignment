package com.example.carcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.carcrud.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
