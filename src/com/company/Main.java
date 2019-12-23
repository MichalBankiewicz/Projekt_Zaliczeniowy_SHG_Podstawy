package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int opcja;
        do {
            System.out.println("MENU:");
            System.out.println("1. Wyswietl wszystkie auta");
            System.out.println("2. Wyswietl dostepne auta");
            System.out.println("3. Wynajmij auto");
            System.out.println("4. Zwroc auto");
            System.out.println("5. Dodaj nowe auto");
            System.out.println("6. Wyjdz");
            System.out.println(" ");
            System.out.print("Podaj numer opcji: ");
            Scanner opcjeMenu = new Scanner(System.in);
            opcja = opcjeMenu.nextInt();


            switch (opcja) {
                case 1:
                    ShowAllCars showAllCars = new ShowAllCars();
                    showAllCars.showCars();
                case 2:
                    ShowAvaliableCars showAvaliableCars=new ShowAvaliableCars();
                    showAvaliableCars.showAvaliableCars();
            }
        } while (!(opcja == 6));
    }
}
