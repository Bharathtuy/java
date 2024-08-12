import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      int n= scan.nextInt();
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              System.out.print("1");
          }
          System.out.println();
      }
        System.out.println();
      System.out.println();
        System.out.println();

      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              System.out.print(-1*(i%2-1));
          }
          System.out.println();
      }
        System.out.println();
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((j%2));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(i==0 || i==n-1|| j==0 || j==n-1){
                   System.out.print("1");
               }
               else{
                   System.out.print("0");
               }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n/2 && j==n/2){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }


    }
}