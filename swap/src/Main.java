public class Main {
    public static void main(String[] args) {
       int a=5;
       int b=6;
       a=a^b;
       b=a^b;
       System.out.println(b);
       a=a^b;
       System.out.println(a);
    }
}