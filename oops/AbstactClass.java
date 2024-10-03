package oops;

public class AbstactClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        
        h.walk();
        h.eat();
        h.changeColor();
        System.out.println(h.color);

        
    }
}
abstract class Animal{
    String color;
    Animal(){
        color = "brown";
        System.out.println("Animal constructor");
    }
    void eat(){
        System.out.println("Animal eat");
    }
    abstract void walk();
}
class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walk");
    }
}


