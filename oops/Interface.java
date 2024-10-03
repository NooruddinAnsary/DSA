package oops;

public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {

    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up , down, left, right, diagonal(4)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up , down, left, right");
    }
    class King implements ChessPlayer{
        public void moves(){
            System.out.println("up , down, left, right(1-step)");
        }
    }
}


//multiple iheritance
interface A {

    
}
interface B {

}


class C implements A, B{

    
}