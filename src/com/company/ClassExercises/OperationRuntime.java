package com.company.ClassExercises;

public class OperationRuntime {
    //I also put static here because I believe that for classes that have no instance attributes,
    // all the methods should be static as there is no real need to instantiate object of that class
    static int doOperation(Operation operation){
        return operation.calculate();
    }
    static int doOperation(SubtractionOperation subtraction){
        return subtraction.calculate();
    }
    static int doOperation(AdditionOperation addition){
        return addition.calculate();
    }
}
