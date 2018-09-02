package com.telerikacademy.cars.services.base;

import com.telerikacademy.cars.models.Car;

import java.util.List;

public interface CarsService {
    List<Car> getAllCars();

    Car findCarById(int id);

    Car create(Car car);
}
