package com.company.ClassExercises.NewImplementation;

public class OperationRuntime {
    // same reason as before why I put static here
    static int doOperation(int x, int y, int option){
        String operation = CheckOperation.check(option);
        if(operation.equals("addition")) return x+y;
        else if(operation.equals("subtraction")) return x-y;
        return -1000000000;
    }
}
