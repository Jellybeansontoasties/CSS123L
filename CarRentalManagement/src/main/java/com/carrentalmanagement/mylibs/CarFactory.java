package com.carrentalmanagement.mylibs;

public class CarFactory {
    // Singleton pattern is optional, but you can implement it if needed
    public Car createCar(String description, String model, String brand, double price, String status) {
        return new Car(description, model, brand, price, status);
    }
}

