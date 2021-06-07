package com.company.InterfaceAbstractClasses;

public class PoliceCar extends Vehicle implements IsEmergency, LandVehicle {
    public PoliceCar(String name, int maxPassengers, int maxSpeed, int numWheels, int displacement) {
        super(name, maxPassengers, maxSpeed, numWheels, displacement);
    }

    @Override
    public void soundSiren() {
        System.out.println("Siren is sounded.");
    }

    public void catchCriminals(){
        System.out.println("Sending a criminal to jail.");
    }

    @Override
    public int getNumWheels() {
        return super.getNumWheels();
    }

    @Override
    public void drive(){
        System.out.println("A police car is being driven.");
    }

    @Override
    public void launch() {
        
    }
}
