import polymorphism.Polymorphism;
import implementation.ImplementationExample;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Polymorphism - Dynamic:");
        Polymorphism.runDynamic();

        System.out.println();
        System.out.println("Polymorphism - Static:");
        Polymorphism.runStatic();

        System.out.println("Implementation example of pillars - Payment Method:");
        ImplementationExample.run();
    }
}