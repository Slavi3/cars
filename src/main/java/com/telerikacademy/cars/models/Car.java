package com.telerikacademy.cars.models;

import com.telerikacademy.cars.models.base.ModelBase;

public class Car extends ModelBase {
    private String make;
    private String carModel;
    private int power;
    private int cubicCapacity;


    public Car() {

    }

    public Car(String make, String carModel, int power, int cubicCapacity) {
        this.make = make;
        this.carModel = carModel;
        this.power = power;
        this.cubicCapacity = cubicCapacity;
    }

    public String getMake() {
        return make;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getPower() {
        return power;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }
}

