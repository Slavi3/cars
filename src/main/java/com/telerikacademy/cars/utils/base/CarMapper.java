package com.telerikacademy.cars.utils.base;

import com.telerikacademy.cars.models.Car;
import com.telerikacademy.cars.viewmodels.CarDetailsViewModel;
import com.telerikacademy.cars.viewmodels.CarViewModel;

import java.util.List;

public interface CarMapper {
    CarViewModel map(Car model);

    Car map(CarViewModel viewModel);

    List<CarViewModel> mapMany(List<Car> models);

    CarDetailsViewModel mapDetails(Car model);
}
