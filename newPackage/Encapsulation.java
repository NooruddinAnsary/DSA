package newPackage;

public class Encapsulation {

   public static void main(String[] args) {
        Laptop lap = new Laptop();
        lap.setPrice(23);
        System.out.println(lap.getPrice());
   } 

//    public void doWork(){
//     System.out.println("Working encap");
//    }

//if you remove "public" then wouldn't be access "doWork()" from "MainClass"
    // void doWork(){
    //     System.out.println("Working encap");
    // }

//if you add "private" then wouldn't be access "doWork()" from "MainClass"
    // private void doWork(){
    //     System.out.println("Working encap");
    //    }
}

class Laptop{
    int ram;
    private int price;
    public void setPrice(int price){
        this.price = price;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getPrice() {
        return price;
    }
    
}