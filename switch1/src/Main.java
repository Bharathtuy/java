import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        char c=scan.next().charAt(0);
        switch(c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            default:
                System.out.println("enter the correct number type");
        }
    }
}