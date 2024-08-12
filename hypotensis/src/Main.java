import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//

        double a;
        double b;
        double c;
        Scanner scan =new Scanner(System.in);
        a=scan.nextDouble();
        b=scan.nextDouble();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println(c);

    }
}