package com.telerikacademy.cars.services;

import com.telerikacademy.cars.models.Car;
import com.telerikacademy.cars.repositories.base.GenericRepository;
import com.telerikacademy.cars.services.base.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsServiceImpl implements CarsService {

    private final GenericRepository<Car> carRepository;

    @Autowired
    public CarsServiceImpl(GenericRepository<Car> carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAllCars() {
        return this.carRepository.findAll();
    }

    @Override
    public Car findCarById(int id) {
        return this.carRepository.findById(id);
    }

    @Override
    public Car create(Car car) {
        carRepository.add(car);
        return car;
    }
}
