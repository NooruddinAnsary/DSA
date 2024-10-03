package Strings;

public class ConvertToUppercase {
    public static String convertUpper(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    
    public static void main(String args[]){
        
        String str = "hi i am Noor";
        System.out.println(convertUpper(str));
    }
}
