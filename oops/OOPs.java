package oops;

public class OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        Student s1 = new Student("Noor");
        Student s2 = new Student(s1);
        System.out.println(s2.name);// copy constractor

    }

}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    Pen(int h) {

    }
    Pen(){

    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calPercentage(int math, int chem, int phys) {
        percentage = (phys + math + chem) / 3;
    }
    Student(Student s){
        this.name= s.name;
    }

    Student(String name) {
        this.name = name;
    }
}
