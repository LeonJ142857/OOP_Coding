package com.company.InterfaceAbstractClasses;

public class HoverCraft extends Vehicle implements LandVehicle, SeaVessel{
    public HoverCraft(String name, int maxPassengers, int maxSpeed, int numWheels, int displacement) {
        super(name, maxPassengers, maxSpeed, numWheels, displacement);
    }

    @Override
    public int getNumWheels() {
        return super.getNumWheels();
    }

    @Override
    public void drive() {
        System.out.println("A hovercraft is being driven.");
    }

    @Override
    public void launch() {
        System.out.println("A hovercraft is being launched.");
    }

    @Override
    public int getDisplacement() {
        return super.getDisplacement();
    }
}
