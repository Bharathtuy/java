import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int k=010;//if you need to store the octal value you have to use 0 infront of the number
        int r=0X10;//if you need to store the hexadecimal value you have to use x infront of it
        int x;//declartion
        x=123;
        int b1= 0b0101;//if you need to store the binary value you have to use b infront of it
        //assignment
        int y=123;//initialization = declaration+assignments
float f= 34f;//you need to specify the f after the value and the same case in long
        double g=12.098765432;//to store 15 values after decimal points
        boolean t =true;//used to store only true or false
          char m='b';


//          byte c=6;
//          int d =c;//byte can be stored in int bec byte has 1 byte mem but d has 4 byte to store no probs
//automatic typecasting
        byte c;
        int d =6;
        c=(byte)d;//expilict type casting function
          String b= scan.nextLine();
        System.out.println(k);
        System.out.println(r);
        System.out.println("the value of y is"+y);
        System.out.println(m);
        System.out.println(t);
        System.out.println(g);
        System.out.println(b+" have a good day");
        System.out.println(x);
        System.out.println(f);
        System.out.println(b1);
        System.out.println(d);
    }
}
