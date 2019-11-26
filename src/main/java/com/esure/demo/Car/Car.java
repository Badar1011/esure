package com.esure.demo.Car;

import java.util.List;

public class Car {

    private List<CarDetails> cars;

    public Car(){

    }

    @Override
    public String toString() {
        return "Car{" +
                "cars=" + cars +
                '}';
    }

    public List<CarDetails> getCars() {
        return cars;
    }

    public void setCars(List<CarDetails> cars) {
        this.cars = cars;
    }

    public Car(List<CarDetails> cars) {
        this.cars = cars;
    }
}
