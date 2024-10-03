package oops;

public class copyConstractor {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "noor";
        s1.roll = 120;
        s1.mark[0] = 5;
        s1.mark[1] = 123;
        s1.mark[2] = 45;
        Students s2 = new Students(s1);
        System.out.println(s2.name);
        s1.mark[1] = 65;
        
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.mark[i]);
        }
    }
}
class Students{
    String name;
    int roll;
    int mark[];
    Students(){
        mark = new int[3];
        System.out.println("Constructor call");
    }
    // //shallow copy constructor
    // Students(Students s1){
    //     mark = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.mark =s1.mark;
    
    // }

    //Deep copy constructor
    Students(Students s1){
        mark = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i= 0; i < mark.length; i++) {
            this.mark[i] =s1.mark[i];
        }
        
    
    }
    Students(String name){
        mark = new int[3];
        this.name = name;
    }
    Students(int roll){
        mark = new int[3];
        this.roll =roll;
    }
}
