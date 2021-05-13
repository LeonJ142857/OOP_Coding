package com.company.ClassExercises;

public class AdditionOperation extends Operation {

    public AdditionOperation(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int calculate(){
        return x + y;
    }

}
