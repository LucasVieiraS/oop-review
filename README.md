# OOP Review (Java Examples)

This project is a **review study** of the four core Object-Oriented Programming (OOP) pillars.  
Each pillar is explained in two layers:
- **Feynman-style analogy** (simple, "teach like I'm 5")
- **Technical explanation + Java example**

---

## The Four Pillars of OOP (in order)

---

### 1. Encapsulation

**Analogy:**  
Think of a vending machine. You press a button and get a soda. You don't open the machine to mess with wires or gears.  
Encapsulation means **the inside is hidden** and you only get safe buttons to press.

**Technical explanation:**  
Encapsulation = hiding an object's internal state and exposing controlled methods.
- Fields should be `private`.
- Public methods enforce rules.
- Prevents uncontrolled access.

```java
class BankAccount {
    private double balance; // hidden
    
    public BankAccount(double initial) {
        if (initial < 0) throw new IllegalArgumentException("No negative start");
        this.balance = initial;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Must deposit > 0");
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
```

---

### 2. Abstraction

**Analogy:**  
When driving a car, you use pedals and a wheel. You don't need to know about pistons, brakes, or fuel injection.  
Abstraction shows you **what** you can do ("brake", "accelerate"), but hides **how** it works.

**Technical explanation:**  
Abstraction = defining *what* an object can do, without specifying *how*.
- Interfaces and abstract classes capture the **contract**.
- Concrete classes decide **how** to implement it.

```java
abstract class Shape {
    public abstract double area(); // every shape must define this
}

class Circle extends Shape {
    private final double r;
    Circle(double r) { this.r = r; }
    public double area() { return Math.PI * r * r; }
}

class Rectangle extends Shape {
    private final double w, h;
    Rectangle(double w, double h) { this.w = w; this.h = h; }
    public double area() { return w * h; }
}
```

---

### 3. Inheritance

**Analogy:**  
You have a blueprint for "Vehicle". Cars and trucks are still vehicles, but they add their own features.  
Inheritance is just **taking something general and making it more specific**.

**Technical explanation:**  
Inheritance = reuse code and model "is-a" relationships.
- Subclasses extend superclasses.
- They inherit behavior but can override or add more.

```java
class Vehicle {
    String model;
    int maxSpeed;

    public void drive() {
        System.out.println(model + " is driving");
    }
}

class Car extends Vehicle {
    int seats;

    @Override
    public void drive() {
        System.out.println("Car " + model + " with " + seats + " seats is driving");
    }
}
```

---

### 4. Polymorphism

**Analogy:**  
You say 'speak!" to a dog and a cat. Both understand, but the dog barks and the cat meows.  
Polymorphism = **same call, different behavior**.

**Technical explanation:**  
Polymorphism = one interface, many forms of behavior.
- **Runtime polymorphism (dynamic dispatch):** overriding methods.
- **Compile-time polymorphism:** overloading methods.

```java
// Runtime: different animals respond differently
class Animal {
    void speak() { System.out.println("Some sound"); }
}
class Dog extends Animal {
    @Override void speak() { System.out.println("Woof!"); }
}
class Cat extends Animal {
    @Override void speak() { System.out.println("Meow!"); }
}

// Compile-time: same name, different parameters
int sum(int a, int b) { return a + b; }
double sum(double a, double b) { return a + b; }

// sum(2, 3) -> int version
// sum(2.5, 3.5) -> double version
```

---

## Glossary

- **Class** → Blueprint for objects.
- **Object** → Instance of a class, lives in memory.
- **Abstract class** → Half-built house: you can"t live in it directly, but it defines what a finished house must have.
- **Concrete class** → Fully built house: you can create objects from it.
- **Interface** → Pure contract: says "this is what you must do", no details of how.
- **Override** → Replace a parent's method with your own implementation.
- **Overload** → Same method name, different parameters.
- **Encapsulation vs Abstraction:**
    - Encapsulation = *hiding the "how" inside the box*.
    - Abstraction = *defining the "what" on the box label*.