import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
//        String d= scan.nextLine();
      int ans=0;
      ans=scan.nextInt();
      int ar[]=new int[5];
      int res=0;
      for(int i=0;ans>0;i++){
          ar[i]=ans%8;
          ans=ans/8;
      }
      for(int i=0;i<5;i++){
          res=res*10+ar[4-i];
      }
//      int l=0;
//      for(int i=0;i<d.length();i++){
//
//              ans=(int)(Math.pow(8,d.length()-1-i))*(d.charAt(i)-48);
//l=l+ans;
//      }


      System.out.print(res);
    }
}