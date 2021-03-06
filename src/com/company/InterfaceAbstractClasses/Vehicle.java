package com.company.InterfaceAbstractClasses;

public abstract class Vehicle {
    private String name;
    private int maxPassengers;
    private int maxSpeed;
    private int numWheels;
    private int displacement;

    public Vehicle(String name, int maxPassengers, int maxSpeed, int numWheels, int displacement) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
        this.displacement = displacement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public abstract void drive();
    public abstract void launch();
}
