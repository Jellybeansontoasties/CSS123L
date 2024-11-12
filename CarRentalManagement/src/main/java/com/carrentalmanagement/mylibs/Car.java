package com.carrentalmanagement.mylibs;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String description;
    private String model;
    private String brand;
    private double price;
    private String status;

    // Constructor with status as a parameter
    public Car(String description, String model, String brand, double price, String status) {
        this.description = description;
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.status = status;
    }

    // Static list of hardcoded Car objects
    public static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("A compact sedan with excellent fuel efficiency and a comfortable ride.", "Civic", "Honda", 50.00, "available"));
        carList.add(new Car("A luxury sedan with a spacious interior and advanced safety features.", "Accord", "Honda", 80.00, "available"));
        carList.add(new Car("A family SUV with three rows of seating and great towing capacity.", "Highlander", "Toyota", 120.00, "rented"));
        carList.add(new Car("A stylish coupe with a turbocharged engine and a sporty drive.", "Mustang", "Ford", 100.00, "available"));
        carList.add(new Car("A full-size pickup truck with off-road capabilities and high towing capacity.", "F-150", "Ford", 110.00, "available"));
        carList.add(new Car("A compact hatchback with nimble handling and a budget-friendly price.", "Mazda3", "Mazda", 45.00, "maintenance"));
        carList.add(new Car("An electric vehicle with impressive range and modern features.", "Model 3", "Tesla", 150.00, "available"));
        carList.add(new Car("A practical compact car with a reputation for reliability and fuel efficiency.", "Corolla", "Toyota", 45.00, "rented"));
        carList.add(new Car("A luxury crossover SUV with cutting-edge technology and a comfortable ride.", "RX", "Lexus", 95.00, "available"));
        carList.add(new Car("A classic sports car with exceptional performance and an iconic design.", "911", "Porsche", 250.00, "available"));
        carList.add(new Car("An all-electric luxury SUV with premium features and advanced tech.", "Model X", "Tesla", 175.00, "rented"));
        carList.add(new Car("A rugged off-road vehicle with a powerful engine and premium interior.", "Wrangler", "Jeep", 110.00, "available"));
        carList.add(new Car("A full-size sedan with a smooth ride and a sleek design.", "Malibu", "Chevrolet", 70.00, "available"));
        carList.add(new Car("A midsize crossover with efficient fuel economy and a spacious cabin.", "Santa Fe", "Hyundai", 75.00, "available"));
        carList.add(new Car("A compact luxury sedan with a smooth drive and refined styling.", "A4", "Audi", 90.00, "available"));
        carList.add(new Car("A family minivan with ample seating and generous storage space.", "Odyssey", "Honda", 85.00, "rented"));
        carList.add(new Car("A budget-friendly sedan with a comfortable interior and decent features.", "Sonata", "Hyundai", 55.00, "available"));
        carList.add(new Car("A sleek hatchback with modern styling and a turbocharged engine.", "Golf", "Volkswagen", 65.00, "available"));
        carList.add(new Car("A midsize sedan with a comfortable ride and an efficient hybrid engine.", "Camry Hybrid", "Toyota", 80.00, "available"));
        carList.add(new Car("A luxury SUV with spacious interiors and cutting-edge tech features.", "X5", "BMW", 150.00, "available"));
        carList.add(new Car("A compact SUV with high safety ratings and a smooth drive.", "RAV4", "Toyota", 95.00, "available"));
        carList.add(new Car("A high-performance SUV with impressive speed and handling.", "Porsche Cayenne", "Porsche", 200.00, "rented"));
        carList.add(new Car("A family-friendly SUV with three rows of seats and ample cargo space.", "Pilot", "Honda", 110.00, "available"));
        carList.add(new Car("A high-performance luxury sedan with a sleek design and powerful engine.", "M5", "BMW", 160.00, "available"));
        carList.add(new Car("A sporty hatchback with great handling and a turbocharged engine.", "Mini Cooper", "BMW", 75.00, "available"));
        carList.add(new Car("An eco-friendly compact car with excellent fuel efficiency and a small footprint.", "Prius", "Toyota", 60.00, "available"));
    }

    // Getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Static method to find a car by model name
    public static Car findCarByModel(String modelName) {
        for (Car car : carList) {
            if (car.getModel().equalsIgnoreCase(modelName)) {
                return car;
            }
        }
        return null; 
    }
}
