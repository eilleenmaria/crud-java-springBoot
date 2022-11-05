package com.crud.demo_maven.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Car {
    private String CarId;
    private String name;
    private String model;
    private String description;
    private String brand;

    public Car(String name, String model, String description, String brand) {
        this.name = name;
        this.model = model;
        this.description = description;
        this.brand = brand;
    }
    
}
