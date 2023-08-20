package com.app.vehiclerent.service;

import java.util.List;

import com.app.vehiclerent.entity.Car;

public interface CarService {
    List<Car> getAllCars();

    Car getCarById(Long id);

    Car createCar(Car car);

    Car updateCar(Long id, Car car);

    void deleteCar(Long id);
}