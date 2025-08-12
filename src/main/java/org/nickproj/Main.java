package org.nickproj;

public class Main {
    public static void main(String[] args){
//        Exercise 1:
        Car myCar = new Car();
        myCar.honk();
        myCar.display();

        Bicycle bike = new Bicycle();
        bike.honk();
        bike.ringBell();

//        Exercise 2:
//         Shape myShape = new Shape(); // This line would cause a compile error

        Circle myCircle = new Circle();
        System.out.println(myCircle.display());

        Rectangle myRectangle = new Rectangle();
        System.out.println(myRectangle.display());

        Dog dog = new Dog();
        dog.breathe();
        dog.makeSound();
//
//     Exercise 3
        Editor myEditor = new Editor();
        CodeEditor myCodeEditor = new CodeEditor();
        Editor polyEditor = new CodeEditor(); // Polymorphism

        System.out.println("--- Regular Editor ---");
        myEditor.openFile();

        System.out.println("\n--- Code Editor ---");
        myCodeEditor.openFile();

        System.out.println("\n--- Polymorphic Editor ---");
        polyEditor.openFile();

//        Mini-Challenge code
        GameCharacter regular = new GameCharacter();
        ArmoredCharacter armored = new ArmoredCharacter();
        regular.takeDamage(100,"Regular Guy");
        armored.takeDamage(100, "Guy Fieri with a bowl cut");


        //Exercise 4
        CheckingAccount myChecking = new CheckingAccount(100.0);
        myChecking.deductMonthlyFee(); // This line cannot be run
    }
}
