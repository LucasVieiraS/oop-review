package polymorphism;

import polymorphism.dynamic.Animal;
import polymorphism.dynamic.Cat;
import polymorphism.dynamic.Dog;
import polymorphism._static.MathUtils;

// Idea: One interface, many implementations.
//Why: Extensible and avoids giant switch/if blocks.
public class Polymorphism {
    public static void runDynamic() {
        // Dynamic polymorphism using override
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.speak();
        cat.speak();
    }

    public static void runStatic() {
        // Static polymorphism using overload
        MathUtils mathUtils = new MathUtils();

        int integerSum = mathUtils.sum(1, 2);
        int integerDivision = mathUtils.divide(5, 2);

        System.out.println("integerSum = " + integerSum);
        System.out.println("integerDivision = " + integerDivision);

        double doubleSum = mathUtils.sum(1.0d, 2.0d);
        double doubleDivision = mathUtils.divide(5, 2.0d);

        System.out.println("doubleSum = " + doubleSum);
        System.out.println("doubleDivision = " + doubleDivision);
    }
}
