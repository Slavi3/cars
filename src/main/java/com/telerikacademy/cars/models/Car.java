package com.telerikacademy.cars.models;

import com.telerikacademy.cars.models.base.ModelBase;

public class Car extends ModelBase {
    private String name;
    private String secretIdentity;

    public Car() {

    }

    public Car(String name, String secretIdentity) {
        setName(name);
        setSecretIdentity(secretIdentity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }
}
