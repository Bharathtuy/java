public class Main {
    static int m(int a, int b){
        return a>b?a:b;
    }
    static double m(double a, double b){
        return a>b?a:b;
    }
    // methods have same name but some differents in datatype

    public static void main(String[] args) {
      System.out.print(m(5,6));
        System.out.print(m(5.0,6));
        System.out.print(Math.abs(-15));
        //we can use inbuilt func to change the negatie to positive one
    }
}