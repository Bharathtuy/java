import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
//       String  s=scan.nextLine();
       int ans=0;
       ans=scan.nextInt();
       int ar[]=new int[ans];
       int k=0;
//       for(int i=0;i<s.length();i++){
//           if(s.charAt(i)==49){
//               ans=ans+(int)(Math.pow(2,s.length()-1-i));
//           }
////           k++;
////           System.out.print(i);
////           System.out.print(s.charAt(i));
//       }
        while(ans>0){
            if(ans%2==0){

            ar[k++]=0;}
        else{

        ar[k++]=1;
        }
        ans=ans/2;}
        for(int i=k-1;i>=0;i--){
            System.out.print(ar[i]);
        }
    }
}