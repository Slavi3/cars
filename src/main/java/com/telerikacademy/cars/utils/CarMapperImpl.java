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
        vm.make = model.getMake();
        vm.carModel = model.getCarModel();
        vm.power=model.getPower();
        vm.cubicCapacity=model.getCubicCapacity();
        return vm;
    }

    @Override
    public Car map(CarViewModel viewModel) {
        Car model = new Car();
        model.setMake(viewModel.make);
        model.setCarModel(viewModel.carModel);
        model.setCubicCapacity(viewModel.cubicCapacity);
        model.setPower(viewModel.power);
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
        vm.make = model.getMake();
        vm.carModel = model.getCarModel();
        vm.cubicCapacity=model.getCubicCapacity();
        vm.power=model.getPower();
        return vm;
    }
}
