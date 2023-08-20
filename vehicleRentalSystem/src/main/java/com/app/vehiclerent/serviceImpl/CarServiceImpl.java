package com.app.vehiclerent.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.vehiclerent.entity.Car;
import com.app.vehiclerent.repository.CarRepository;
import com.app.vehiclerent.service.CarService;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Car createCar(Car Car) {
        return carRepository.save(Car);
    }

    @Override
    public Car updateCar(Long id, Car Car) {
        if (!carRepository.existsById(id)) {
            return null;
        }
        Car.setCarId(id);
        return carRepository.save(Car);
    }

    @Override
    public void deleteCar(Long id) {
    	carRepository.deleteById(id);
    }
}