package AnujDSA;

//import newPackage.Encapsulation;

public class MainClass {

    public static void main(String[] args) {
        //Person p1 = new Person(); 

        // p1.age = 24;
        // p1.name = "noor";
        // System.out.println(p1.age+" "+p1.name);

        Person p2 = new Person(31, "Nooruddin");
    
        System.out.println(p2.name+" age "+p2.age);

        // p1.eat();
        // p2.walk();
        // p1.walk(63);
        // System.out.println(Person.count);

        // Developer dev = new Developer(24, "Nooruddin");
        // dev.walk();
        // dev.walk(32);

       // Encapsulation obj = new Encapsulation();
        //obj.doWork();

    }   
}

class Developer extends Person{

    public Developer(int age, String name) {
        //if you want to use some properties of parent the "super" is used
        super(age, name);  //here "super" basically used to call constructor of parent
        
        
    }
    void walk(){
        System.out.println("Developer " + name + " walking");
    }
}

class Person{
    protected String name;
    int age;
    static int count; 
   // public Person() {   //if not create default constractor then automatically will be create a default constractor.
        
       // count++;                
      //  System.out.println("creating an object"); 
        
   // }
    public Person(int age, String name){
       // this(); //call default constructor with this parameter constructor
        this.age = age;
        this.name = name;
    }
    void walk() {
        System.out.println(name + " is waking.");
    }

    void eat(){
        System.out.println(name+" is eating");
    }

    void walk(int steps) {
        System.out.println(name+ " walked "+steps+ " steps");
    }
    void doWork(){
        System.out.println("hello");
    }

}
