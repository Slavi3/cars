package com.telerikacademy.cars.api;

import com.telerikacademy.cars.models.Car;
import com.telerikacademy.cars.services.base.CarsService;
import com.telerikacademy.cars.utils.base.CarMapper;
import com.telerikacademy.cars.viewmodels.CarDetailsViewModel;
import com.telerikacademy.cars.viewmodels.CarViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/superheroes")
public class CarsApiController {
    private final CarsService carsService;
    private final CarMapper mapper;

    @Autowired
    public CarsApiController(CarsService carsService, CarMapper mapper) {
        this.carsService = carsService;
        this.mapper = mapper;
    }

    @RequestMapping(
            method = RequestMethod.GET
    )
    public List<CarViewModel> getAllSuperheroes() {
        List<Car> models = this.carsService.getAllCars();
        return this.mapper.mapMany(models);
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET
    )
    public CarDetailsViewModel getCarById(@PathVariable("id") String idString) {
        int id = Integer.parseInt(idString);
        Car model = this.carsService.findCarById(id);
        return this.mapper.mapDetails(model);
    }

    @RequestMapping(
            method = RequestMethod.POST
    )
    public ResponseEntity<CarViewModel> createCar(@RequestBody CarViewModel carVm) {
        Car model = this.mapper.map(carVm);
        Car car = this.carsService.create(model);
        CarViewModel vmToReturn = this.mapper.map(car);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(vmToReturn);
    }
}
