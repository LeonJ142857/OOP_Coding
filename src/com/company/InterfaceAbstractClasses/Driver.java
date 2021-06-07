package com.company.InterfaceAbstractClasses;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Vehicle> policeCars = new ArrayList<>();
        PoliceCar policeCar = new PoliceCar("BMW",
                6, 180, 4,
                3000);
        policeCars.add(policeCar);
        System.out.println(policeCars.get(0));
        policeCar.catchCriminals();
        policeCar.soundSiren();
        policeCar.drive();
    }
}
