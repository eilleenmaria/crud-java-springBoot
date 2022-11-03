package com.crud.demo_maven.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.crud.demo_maven.model.Car;
import com.crud.demo_maven.service.CarService;

@Component
public class CarFiller {
    private final CarService carService;
    public CarFiller(CarService carService) {
        this.carService = carService;
    }
    @PostConstruct
    public void init(){
        Car car1 = new Car("Artura", "2022","Super-light engineering. Extreme power.","McLaren");
        carService.addCar(car1);
        try{Thread.sleep(1000);}catch(InterruptedException e){}
        
        Car car2 = new Car("W16 Mistral", "2024","Only 99 copies of the Bugatti W16 Mistral and deliveries will begin in 2024","Bugatti");
        carService.addCar(car2);
        try{Thread.sleep(1000);}catch(InterruptedException e){}
        Car car3 = new Car("BMW-Z4", "2023","Super-light engineering. Extreme power.","BMW");
        carService.addCar(car3);
        try{Thread.sleep(1000);}catch(InterruptedException e){}
    }
}
