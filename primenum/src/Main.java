import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner scan= new Scanner(System.in);
     int n = scan.nextInt();
     int f=0;
     for(int i=0;i<=n;i++){
         if( i>1 && i<=2 ){
             System.out.print(i+" ");
         }

         else if(i>2) {
             for (int j = 2; j <=i/2 ; j++) {
                 if (i % j == 0) {
                     f = 1;
                     break;
                 }
                 f=0;
             }
             if (f == 0) {
                 System.out.print(i+" ");
             }
         }
     }
    }
}
