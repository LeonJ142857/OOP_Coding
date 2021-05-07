package com.company.ClassExercises.DefaultImplementation;

public class CheckOperation {
    // access modifier is default because I have another class with the same name in another package
    // the reason I use static here is the same why I use static in doOperation method
    static String check(Operation operation){
        if(operation instanceof AdditionOperation)
            return "addition";
        else if(operation instanceof SubtractionOperation)
            return "subtraction";
        return "other operation";
    }
}
