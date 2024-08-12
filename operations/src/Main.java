public class Main {
    public static void main(String[] args) {
       int tea=10;
       tea= tea+1;
       /*
       = assignment
       + addition

       - subtraction
       / division
       * multiplication
       -- decrement
       ++ increment
       % modulo
        */

System.out.println(tea);
tea ++;
        System.out.println(tea);
        tea--;
        System.out.println(tea);
        tea = tea*2;
        System.out.println(tea);
        tea = tea/2;
        System.out.println(tea);

        tea = tea/3;// it does not store decimal value because is an int type

        System.out.println(tea);
        tea = tea%2;
        System.out.println(tea);
        double an =12;
        an = an/5;

        System.out.println(an);
//        System.out.println("Hello world!");
    }
}