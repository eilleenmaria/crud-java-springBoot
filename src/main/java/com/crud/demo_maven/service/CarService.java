package com.crud.demo_maven.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.demo_maven.model.Car;
import com.crud.demo_maven.repository.ICarRepository;

@Service
public class CarService {
    private final ICarRepository carRepository;

    public CarService(ICarRepository carRepository){
        this.carRepository = carRepository;
    }
    public List<Car> getAll()
    {
        return carRepository.getAll();
    }
    public Car get(String carId){
        return carRepository.get(carId);
    }
    public Car getBrand(String brand){
        return carRepository.get(brand);
    }
    
    public Car addCar(Car car){
      car.setCarId(null);
      return carRepository.save(car); 
    }
    public Car updateCar(String CarId, Car car ){
        Car carN = carRepository.get(CarId);
        if(carN == null){
            return null;
        }
        car.setCarId(CarId);
        return carRepository.save(car);
    }
    public Car deleteCar(String carId){
        return carRepository.delete(carId);
    }
}
