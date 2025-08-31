package abstraction;

abstract class Shape {
    // Every shape must implement how to calculate its area
    public abstract double getArea();

    // Optional: shared behavior (encapsulation of reusable logic)
    public void printArea() {
        System.out.println("Area is: " + getArea());
    }
}