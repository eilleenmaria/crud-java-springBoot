package com.crud.demo_maven.repository;

import java.util.List;

import com.crud.demo_maven.model.Car;

public interface ICarRepository {
    public List <Car>getAll();
    public Car get(String CarId);     
    public Car save(Car car);
    public Car delete(String CarId);
}
