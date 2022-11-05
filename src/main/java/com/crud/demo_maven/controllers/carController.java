package com.crud.demo_maven.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo_maven.model.Car;
import com.crud.demo_maven.service.CarService;

@RestController
@RequestMapping({"car"})
public class carController {
   private final CarService carService;

public carController(CarService carService) {
    this.carService = carService;
} 
@GetMapping("")
public List<Car> getAll(){
    return carService.getAll();
}
@GetMapping("/{carId}")
public Car get(@PathVariable String carId){
    return carService.get(carId);
}
@PostMapping("")
public Car addCar( @RequestBody Car car){
    return carService.addCar(car);
}
@PutMapping("/{carId}")
public Car addCar( @PathVariable String carId, @RequestBody Car car){
    return carService.updateCar(carId, car);
}
@DeleteMapping("/{carId}")
public Car addCar( @PathVariable String carId){
    return carService.deleteCar(carId);
}
}

