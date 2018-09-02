package com.telerikacademy.cars.utils;
import com.telerikacademy.cars.models.Car;
import com.telerikacademy.cars.utils.base.CarMapper;
import com.telerikacademy.cars.viewmodels.CarDetailsViewModel;
import com.telerikacademy.cars.viewmodels.CarViewModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarMapperImpl implements CarMapper {
    @Override
    public CarViewModel map(Car model) {
        CarViewModel vm = new CarViewModel();
        vm.id = model.getId();
        vm.name = model.getName();
        vm.secretIdentity = model.getSecretIdentity();
        return vm;
    }

    @Override
    public Car map(CarViewModel viewModel) {
        Car model = new Car();
        model.setName(viewModel.name);
        model.setSecretIdentity(viewModel.secretIdentity);
        return model;
    }

    @Override
    public List<CarViewModel> mapMany(List<Car> models) {
        return models.stream()
                .map(this::map)
                .collect(Collectors.toList());
    }

    @Override
    public CarDetailsViewModel mapDetails(Car model) {
        CarDetailsViewModel vm = new CarDetailsViewModel();
        vm.id = model.getId();
        vm.name = model.getName();
        vm.secretIdentity = model.getSecretIdentity();
        return vm;
    }
}
