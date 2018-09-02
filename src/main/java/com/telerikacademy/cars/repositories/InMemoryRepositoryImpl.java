package com.telerikacademy.cars.repositories;


import com.telerikacademy.cars.models.base.ModelBase;
import com.telerikacademy.cars.repositories.base.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryRepositoryImpl<T extends ModelBase> implements GenericRepository<T> {
    private final Class<T> klass;
    private List<T> items;

    @Autowired
    public InMemoryRepositoryImpl(Class<T> klass) {
        this.klass = klass;
        this.items = new ArrayList<>();
    }

    @Override
    public List<T> findAll() {
        return this.items;
    }

    @Override
    public T findById(int id) {
        return this.items.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(T car) {
        int nextId = this.getNextId();
        car.setId(nextId);
        this.items.add(car);
    }

    private int getNextId() {
        int biggestId = this.items.stream()
                .mapToInt(ModelBase::getId)
                .max()
                .orElse(0);
        return biggestId + 1;
    }
}
