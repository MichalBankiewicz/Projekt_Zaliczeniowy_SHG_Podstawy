package com.company;

public abstract class Car {
    public String carBrand;
    public String carModel;
    public String registrationNumber;
    public boolean availability;

    public Car(String carBrand, String carModel, String registrationNumber, boolean availability) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.registrationNumber = registrationNumber;
        this.availability = availability;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", availability=" + availability +
                '}';
    }
}
