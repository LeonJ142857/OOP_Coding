package com.company.InterfaceAbstractClasses;

public class Jeep extends Vehicle implements LandVehicle{

    public Jeep(String name, int maxPassengers, int maxSpeed, int numWheels, int displacement) {
        super(name, maxPassengers, maxSpeed, numWheels, displacement);
    }

    @Override
    public int getNumWheels() {
        return super.getNumWheels();
    }

    @Override
    public void drive() {
        System.out.println("A jeep is being driven.");
    }

    @Override
    public void launch() {
        //do nothing
    }
}
