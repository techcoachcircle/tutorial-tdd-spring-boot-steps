package com.example.car.service;

import com.example.car.model.Car;
import com.example.car.repository.CarRepository;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarService {

    @Autowired
    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars() {
        return IteratorUtils.toList(carRepository.findAll().iterator());
    }
}
