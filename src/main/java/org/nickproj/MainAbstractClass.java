package org.nickproj;

// Abstract parent class
abstract class Shape {
    // Abstract method (does not have a body)
    public abstract double area();

    // Concrete method
    public String display() {
        return "The area is: " + area();
    }
}

// Concrete subclass
class Circle extends Shape {
    private double radius = 5.0;

    // Provide implementation for the abstract method
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    private double length = 4.0;
    private double width = 6.0;

    // Provide implementation for the abstract method
    public double area() {
        return length * width;
    }
}

//Mini-Challenge Code
abstract class Animal{
    void breathe(){
        System.out.println("Inhale... Exhale...");
    }
    abstract void makeSound();
}

class Dog extends Animal{
//    public void breathe(){ //Own test of super functionality
//        super.breathe();
//        System.out.println("New breathe!");
//    }
    @Override
    public void makeSound(){ //Valid since public is less-restrictive than package private, valid override
        System.out.println("Woof!");
    }
}
//public class MainAbstractClass {
//    public static void main(String[] args) {
//        // Shape myShape = new Shape(); // This line would cause a compile error
//
////        Circle myCircle = new Circle();
////        System.out.println(myCircle.display());
////
////        Rectangle myRectangle = new Rectangle();
////        System.out.println(myRectangle.display());
//
//        Dog dog = new Dog();
//        dog.breathe();
//        dog.makeSound();
//
//    }
//}