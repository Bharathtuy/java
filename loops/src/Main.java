import  java.util.*;
public class Main {
    public static void main(String[] args) {
     int f=9;
     int k=0;
     for(int i=0;i<f;i++){
         System.out.print("* ");
     }
        System.out.println();
     /// i  value is 0 it runs the loop until i reach 9 and con becomes false
   while(k<f){
       System.out.print(k++);

   }
   System.out.println();
int m=0;
   do{
       System.out.print(m++);
   }
   while(m<=5);
        System.out.println();
        for(int i=0;i<=5;i++){
   for(int j=0;j<=i;j++){
       System.out.print("* ");
   }
   System.out.println();
        }

    }

}