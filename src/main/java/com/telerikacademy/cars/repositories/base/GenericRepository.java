package com.telerikacademy.cars.repositories.base;

import com.telerikacademy.cars.models.base.ModelBase;

import java.util.List;

public interface GenericRepository<T extends ModelBase> {
    List<T> findAll();

    T findById(int id);

    void add(T car);
}
