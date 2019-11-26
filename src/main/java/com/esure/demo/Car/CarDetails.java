package com.esure.demo.Car;

public class CarDetails {


    private String brand;
    private String model;
    private String fuel;
    private int doors;
    private String colour;

    public CarDetails(String brand, String model, String fuel, int doors, String colour) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.doors = doors;
        this.colour = colour;
    }

    public CarDetails(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                ", doors=" + doors +
                ", colour='" + colour + '\'' +
                '}';
    }
}
