package com.crud.demo_maven.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.crud.demo_maven.model.Car;
@Repository
public class MemoryCarRepository implements ICarRepository {
    private Map<String, Car> carsMap;
    MemoryCarRepository(){
        carsMap = new HashMap<>();
    }
    @Override
    public List<Car> getAll() {
        List<Car> list = new ArrayList<>();
        list.addAll(carsMap.values());
        return list;
    }

    @Override
    public Car get(String CarId) {
       
        return carsMap.get(CarId);
    }

    @Override
    public Car save(Car car) {
        
        return carsMap.put(car.getCarId(), car);
    }

    @Override
    public Car delete(String CarId) {
       
        return carsMap.remove(CarId);
    }
    
}
