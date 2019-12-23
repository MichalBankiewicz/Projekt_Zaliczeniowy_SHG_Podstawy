package com.company;

public class ElectricCar extends Car {
    public int electricPower;
    public int range;

    public ElectricCar(String carBrand, String carModel, String registrationNumber, boolean availability,int electricPower,int range) {
        super(carBrand, carModel, registrationNumber, availability);
        this.electricPower=electricPower;
        this.range=range;
    }

    public int getElectricPower() {
        return electricPower;
    }

    public void setElectricPower(int electricPower) {
        this.electricPower = electricPower;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "electricPower=" + electricPower +
                ", range=" + range +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", availability=" + availability +
                '}'+"\n";
    }
}
