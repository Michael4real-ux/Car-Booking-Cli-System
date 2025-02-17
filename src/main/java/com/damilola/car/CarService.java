package com.damilola.car;

import java.util.List;

public class CarService {
   private final CarDao carDao;

    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public Car getCar(String regNumber){
     return carDao.getCars().stream().filter(car -> car.getRegNumber().equals(regNumber)).findFirst().orElse(null);
    }

    public List<Car> getAllCars(){
        return carDao.getCars();
    }

    public List<Car> getAllElectricCars(){
        return getAllCars().stream().filter(Car::isElectric).toList();
    }
}
