package com.company.ClassExercises.DefaultImplementation;

public class OperationRuntime {
    //I also put static here because I believe that for classes that have no instance attributes,
    // all the methods should be static as there is no real need to instantiate object of that class
    // therefore only functioning as a "namespace" analog as in C++
    static int doOperation(Operation operation){
        return operation.calculate();
    }
}
