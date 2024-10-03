package AnujDSA;

public class Abstraction {
    public static void main(String[] args) {
        Audi a1 = new Audi();
        a1.start();
    }
}

abstract class Car{
    int price;

    abstract void start();
    void breaks(){   //concrete function
        System.out.println("Car is breaking");
    }
}

class Audi extends Car{

    @Override
    void start() {
        System.out.println("Audi is starting.");
        
    }

}
class BMW extends Car{


    @Override
    void start() {
        System.out.println("BMW is starting ");
        
    }

}
