package com.company.ClassExercises;

public abstract class Operation {
    // I put static here, because it is the only place possible that won't generate error
    // if I put it in combination with abstract, the code won't compile
    // as the purpose of abstract is to achieve dynamic binding while static is for static binding
    // and the two cannot be done together.
    // Also, a static method belongs to the class not to the object, therefore
    // if I try to make a method static it will be impossible to override.
    // if I put it in the overridden method, the compiler will complain too because
    // by adding static in the  method that overrides the abstract method,
    // java will not be able to recognize the method as it has a different
    // method signature compared to the one in the abstract class (one is static and one is not).
    // Therefore, by using logical elimination, I have arrived to the conclusion that the only sensible spot
    // to put the static keyword is on the attributes as it is the only place that will not create problems
    // for the compiler.
    // I added static keyword to the method in OperationRuntime too, see the explanation there.
    int x, y;
    public abstract int calculate();
}
