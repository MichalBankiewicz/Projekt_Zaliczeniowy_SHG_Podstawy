package com.company;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ShowAvaliableCars {
    public void showAvaliableCars() throws IOException {
        String typeOfCar = "";
        String carBrand = "";
        String carModel = "";
        String registrationNumber = "";
        String availability = "";
        String electricPower = "";
        String range = "";
        String engineType = "";
        String powerHorses = "";
        Scanner in = new Scanner(new FileInputStream("dane.txt"));
        BufferedWriter out = new BufferedWriter(new java.io.FileWriter("result.txt"));
        while (in.hasNext()) {
            if (in.hasNextLine()) {
                typeOfCar = in.next();
                if (typeOfCar.equals("ElectricCar")) {
                    carBrand = in.next();
                    carModel=in.next();
                    registrationNumber=in.next();
                    availability=in.next();
                    electricPower=in.next();
                    range=in.next();
                        if(availability.equals("true")) {
                            System.out.print("Electric cars: ");
                            System.out.println(carBrand + " " + carModel + " " + registrationNumber + " " + availability + " " + electricPower + " " + range);
                        }

                } else if (typeOfCar.equals("CobustionCar")) {
                    carBrand = in.next();
                    carModel = in.next();
                    registrationNumber = in.next();
                    availability = in.next();
                    engineType = in.next();
                    powerHorses = in.next();
                    if (availability.equals("true")) {
                        System.out.print("Combustion cars: ");
                        System.out.println(carBrand + " " + carModel + " " + registrationNumber + " " + availability + " " + engineType + " " + powerHorses);
                    }
                }
                out.write(String.valueOf(carBrand) + "\n");
            }

        }
        out.close();
    }



}
