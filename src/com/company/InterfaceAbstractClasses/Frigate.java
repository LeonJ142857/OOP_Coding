package com.company.InterfaceAbstractClasses;

public class Frigate extends Vehicle implements SeaVessel{
    public Frigate(String name, int maxPassengers, int maxSpeed, int numWheels, int displacement) {
        super(name, maxPassengers, maxSpeed, numWheels, displacement);
    }

    @Override
    public void launch() {
        System.out.println("Frigate is launched");
    }
    @Override
    public int getDisplacement(){
        return super.getDisplacement();
    }
}
