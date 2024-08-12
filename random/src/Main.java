import java.util.Random;
public class Main {
    public static void main(String[] args) {
       Random random = new Random();
       int a;
       a= random.nextInt(9);
       // random used to pick up a random number from the limit -2 billion to 2 billion
       System.out.println(a);
       double q= random.nextDouble();
       System.out.println(q);

       // random function used to pick a random number for ex if we use random in double without limit it should randomly pick up a number inbetween 0 to 1
       int s;
       s= random.nextInt(6);
        System.out.println(s);

    }
}