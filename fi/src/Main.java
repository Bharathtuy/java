import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int angle= scan.nextInt();
        angle=angle%360;
        if(angle>0&&angle<90){
            System.out.print("it is acute angle");
        }
       else if(angle==90){
            System.out.print("it is right angle");
        }
      else  if(angle>90&&angle<180){
            System.out.print("it is obtuse angle");
        }
        else if(angle==180){
            System.out.print("it is straight  angle");
        }
        else if(angle>180 && angle<360)
            System.out.println("it is reflex angle");
        else if(angle==360){
            System.out.print("it is rotated angle");
        }
    }
}