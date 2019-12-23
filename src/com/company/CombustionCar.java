package com.company;

public class CombustionCar extends Car {
    public EngineType engineType;
    public int powerHorses;

    public CombustionCar(String carBrand, String carModel, String registrationNumber, boolean availability, int powerHorses, EngineType engineType) {
        super(carBrand, carModel, registrationNumber, availability);
        this.powerHorses = powerHorses;
        this.engineType = engineType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getPowerHorses() {
        return powerHorses;
    }

    public void setPowerHorses(int powerHorses) {
        this.powerHorses = powerHorses;
    }

    @Override
    public String toString() {
        return "CompusionCar{" +
                "engineType=" + engineType +
                ", powerHorses=" + powerHorses +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", availability=" + availability +
                '}'+"\n";
    }
}