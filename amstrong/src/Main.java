import  java.util.*;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int count =0;
        int dul=a;
        int d2=a;
        int res=0;
        int var=0;
        int out=0;
        for(int i=0;dul>0;i++){
            dul=dul/10;
            count++;
        }
        for(int i=0;a>0;i++){
            var=a%10;
            res=var;
            for(int j=1;j<count;j++){
                res*=var;
            }
           out=out+res;
            a=a/10;
            System.out.println(out);
        }
        System.out.println(out);
        if(d2==out){
            System.out.println("it is amstrong number");
        }
        else{
            System.out.println("it is not a amstrong number");
        }
    }
}