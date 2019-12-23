package com.company;

import java.util.ArrayList;
import java.util.List;

public class DataCar {

    public List<CombustionCar> combustionCarsList=new ArrayList<>();
    public List<ElectricCar> electricCarsList=new ArrayList<>();

    public List<CombustionCar> addCombustionCar (){
        combustionCarsList.add(new CombustionCar("mercedes","c63","WW5442C",true,300,EngineType.DISEL));
        combustionCarsList.add(new CombustionCar("toyota","corolla","WD787978",true,98,EngineType.GAZ));
        combustionCarsList.add(new CombustionCar("opel","corsa","WD72358W",false,100,EngineType.BENZYNA));
        return combustionCarsList;

    }

    public List<ElectricCar> addElectricCar(){
        electricCarsList.add(new ElectricCar("bmw","e36","WW5442C",true,300,500));
        electricCarsList.add(new ElectricCar("volkswagen","x6","WW5442C",false,150,500));
        return electricCarsList;
    }

    public static void main(String[] args) {
        DataCar dataCar = new DataCar();
        System.out.println(dataCar.addCombustionCar());
        System.out.println(dataCar.addElectricCar());
    }
}
