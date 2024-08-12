import java.util.*;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        if(num>0){
            System.out.println("number is positive "+num);
        }
        else{
            if(num==0)
                System.out.println("number is neutral "+num);
            else
            System.out.println("number is negative"+num);
    }
    int mark= scan.nextInt();
        if(mark>=90)
            System.out.println("Grade A");
        else if(mark>=80)
            System.out.println("Grade B");
        else if (mark>=70) {
            System.out.println("Grade c");
        }
        else{
            System.out.println("Grade D");
        }
    }
}