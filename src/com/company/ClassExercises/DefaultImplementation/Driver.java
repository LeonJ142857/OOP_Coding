package com.company.ClassExercises.DefaultImplementation;

public class Driver {
    public static void main(String[] args) {
        // as the attributes of Operations x and y is declared static, the only way to assign them would
        // be by this syntax : <<ClassName>>.<<attributeName>> = value;
        // setting the attribute from object of instance additionOperation
        // or SubtractionOperation will be redundant as semantically, the term static means
        // that the attribute / method belongs to the class
        Operation.x = 5;
        Operation.y = 7;
        // here I'm printing out the result by calling the static method doOperation
        // from class OperationRuntime which accepts an Operation object as an argument
        // and then I check the type of the operation from CheckOperation.check()
        System.out.println(OperationRuntime.doOperation(new AdditionOperation()));
        System.out.println(OperationRuntime.doOperation(new SubtractionOperation()));
        System.out.println(CheckOperation.check(new AdditionOperation()));
        System.out.println(CheckOperation.check(new SubtractionOperation()));
    }
}
