package org.nickproj;

// Parent class
class Vehicle {
    protected String brand = "Generic Vehicle";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

// Child class
class Car extends Vehicle {
    private String modelName = "Mustang";

    public void display() {
        System.out.println("I am a " + brand + " " + modelName);
    }
}

class Bicycle extends Vehicle{
    public void ringBell(){
        System.out.println("Ring ring!");
    }

}


//public class MainBasicInheritance {
//    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.honk();
//        myCar.display();
//
//        Bicycle bike = new Bicycle();
//        bike.honk();
//        bike.ringBell();
//    }
//}