package com.example.carcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carcrud.entity.Car;
import com.example.carcrud.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carsRepository;
	
	public Car save(Car car) {
		return carsRepository.save(car);
	}
	
	public Car getCar(int carid) {
		return carsRepository.findById(carid).get();
		
	}
	
	public Car update(Car cars) {
		Car car = carsRepository.findById(cars.getId()).get();
		car.setManufacturer(cars.getManufacturer());
		car.setModel(cars.getModel());
		car.setYom(cars.getYom());
		
		return carsRepository.save(car);
	}
	
	public Car delete(int carid) {
		carsRepository.deleteById(carid);
		Car car = new Car();
		car.setStatus("deleted");
		return car;
	}
	
	public CarRepository getCarRepository() {
		return carsRepository;
	}
	
	public void setCarRepository(CarRepository carRepository) {
	
		this.carsRepository = carRepository;
	}
}
