package org.nickproj;

class Editor {
    public void openFile() {
        System.out.println("Opening a generic file.");
    }
}

class CodeEditor extends Editor {
    @Override
    public void openFile() {
        System.out.println("Applying syntax highlighting...");
        super.openFile(); // Call the parent's method
    }
}

class GameCharacter{
    protected int health = 100;
    protected void takeDamage(int amount, String characterName){
        if(amount%2==0){
            health-=amount;
            System.out.format("%s takes %d damage. New health: %d\n",characterName,amount,health);
        }
        else{
            System.out.println("Health value not even.");
        }
    }
}

class ArmoredCharacter extends GameCharacter{
    @Override
    public void takeDamage(int amount, String characterName){
        super.takeDamage(amount/2,characterName);
    }
}

public class MainMethodOverriding {
    public static void main(String[] args) {
        //Mini-Challenge code
        GameCharacter regular = new GameCharacter();
        ArmoredCharacter armored = new ArmoredCharacter();
        regular.takeDamage(100,"Regular Guy");
        armored.takeDamage(100, "Guy Fieri with a bowl cut");

//        Editor myEditor = new Editor();
//        CodeEditor myCodeEditor = new CodeEditor();
//        Editor polyEditor = new CodeEditor(); // Polymorphism
//
//        System.out.println("--- Regular Editor ---");
//        myEditor.openFile();
//
//        System.out.println("\n--- Code Editor ---");
//        myCodeEditor.openFile();
//
//        System.out.println("\n--- Polymorphic Editor ---");
//        polyEditor.openFile();
    }
}