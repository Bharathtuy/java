import  java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      int unit=scan.nextInt();
//      char a=  scan.next().charAt(0);
//      System.out.println(a);
      int res=0;
//      if(unit<=100 ){
//unit=unit*10;
//
//      }
//      else if(unit<=200){
//
//unit=(unit-100)*15+100*10;
//        }
//      else if( unit<=300){
//unit=(unit-200)*20+100*15+100*10;
//      }
//      else if(unit>300){
//          unit=(unit-300)*25+100*20+100*15+100*10;
//      }


        if(unit>300 ){

            res=res+(unit-300)*25;
            unit=300;

        }
         if(unit>200){

            res=res+(unit-200)*20;
            unit=200;
        }
         if( unit>100){
           res=res+(unit-100)*15;
           unit=100;

        }
        if(unit<=100){
            res=res+unit*10;
        }
      System.out.print(res);
//        System.out.println(unit);
    }
}