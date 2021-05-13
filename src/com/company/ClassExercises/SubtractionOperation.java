package com.company.ClassExercises;

public class SubtractionOperation extends Operation {

    public SubtractionOperation(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int calculate(){
        return x - y;
    }

}
