package com.company.ClassExercises.NewImplementation;

public class Driver {
    // I believe that there is no need to define the operations in separate classes
    // therefore in this package, I create my new implementation
    // of OperationRuntime and CheckOperation that does not depend on another class
    // actually further simplifying the classes into just one class is possible
    public static void main(String[] args) {
        int x = 100;
        int y = 50;
        System.out.println(OperationRuntime.doOperation(x, y, 1));
        System.out.println(OperationRuntime.doOperation(x, y, 2));
        System.out.println(OperationRuntime.doOperation(x, y, 3));
        System.out.println(CheckOperation.check(1));
        System.out.println(CheckOperation.check(2));
    }
}
