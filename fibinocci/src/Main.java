import java.util.*;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner scan =new Scanner(System.in);
        int n= scan.nextInt();
        int a=0;
        int b=1;
        int c =0;
//        System.out.println(a);
//        System.out.println(b);

        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;

        }
        System.out.println(c);
    }
}