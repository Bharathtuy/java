public class Main {
  static int fact(int n){
if(n==0)
    return 1;
else
    return n*fact(n-1);
//recursion for factorila
    }
    public static void main(String[] args) {
       int b=5;
       System.out.print(fact(5));
    }
}