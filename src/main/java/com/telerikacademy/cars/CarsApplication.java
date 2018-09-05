package com.telerikacademy.cars;

import com.telerikacademy.cars.models.Car;
import com.telerikacademy.cars.repositories.base.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CarsApplication {
    @Autowired
    public CarsApplication(GenericRepository<Car> carsRepository) {
        List<Car> initialSuperheroes = Arrays.asList(
                new Car("BMV", "640", 313, 4000),
                new Car("Audi", "S5", 354, 4200),
                new Car("Mercedes-Benz", "S600", 525, 5513)
        );
        initialSuperheroes.forEach(carsRepository::add);
    }

    public static void main(String[] args) {
        SpringApplication.run(CarsApplication.class, args);
    }
}
