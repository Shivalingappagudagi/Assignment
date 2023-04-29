package com.example.carcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carcrud.entity.Car;
import com.example.carcrud.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	private CarService carService;

	@PostMapping
	public Car addCar(@RequestBody Car car) {
		return carService.save(car);
	}

	@GetMapping(path = "/{carid}")
	public Car getCar(@PathVariable int carid) {
		return carService.getCar(carid);
	}

	@PutMapping
	public Car updateCar(@RequestBody Car car) {
		return carService.update(car);
	}

	@DeleteMapping
	public Car deleteCar(@RequestBody Car car) {
		return carService.delete(car.getId());
	}
}
