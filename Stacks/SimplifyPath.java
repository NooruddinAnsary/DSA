package Stacks;
import java.util.Stack;
public class SimplifyPath {
    public static String smplPath(String path) {
        String arr[] = path.split("/");
        String op = "/";
        
        Stack<String> s = new Stack<>();
        for(int i=0; i < arr.length; i++){
            if(arr[i].equals("..")){
                if (!s.isEmpty()) {
                    s.pop(); // Pop the stack if it's not empty
                }
            }
            else if(arr[i].equals(".") || arr[i].equals("")){
                continue;
            }
            else{
                s.push(arr[i]);
            }
        }

        Stack<String> rev = new Stack<>();
        while(s.size() > 0){
            rev.push(s.pop());
        }

        if(rev.isEmpty()){
            return op;
        }
        else{
            
            while(rev.size()>0){
                if(rev.size() != 1){
                    op = op + rev.pop()+ "/";
                }
                else{
                    op =op + rev.pop();
                }
            }
            
        }
        return op;
        
    }
    public static void main(String args[]){
        String op = smplPath("/home/../////l/pop////");
        System.out.println(op);
        
    }
}
