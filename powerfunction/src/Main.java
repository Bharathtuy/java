import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       int num= scan.nextInt();
       int power= scan.nextInt();
       int res=0;
       int temp=num;
       for(int i=1;i<power;i++){
           num*=temp;
       }
       System.out.println(num);
    }
}