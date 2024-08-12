import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
//
        String s= scan.nextLine();
       int res=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)>=48 && s.charAt(i)<=57){
   res=res+(int)(Math.pow(16,s.length()-1-i))*(s.charAt(i)-48);
        }
        else {
            res=res+(int)(Math.pow(16,s.length()-1-i)*((s.charAt(i)-65)+10));
            System.out.println(res);
        }
       }
System.out.print(res);
    }
}