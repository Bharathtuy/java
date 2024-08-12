import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n= scan.nextInt();
        while(n>=0){
            if(n%10==0){
                System.out.println(n);
                break;
            }
            n--;
        }
        //break coditions exit loop when it reachs break
        int res=0
                ;
        int sum=0;
        while(true){
            res= scan.nextInt();
            if(res<0)
                break;
            sum=sum+res;
        }
        System.out.println(sum);


 out:
        for(int i=0;i<5;i++){
            in://label
            for(int j=0;j<=i;j++){
                if(i==3)
                    break out;//label  we can use where we wnated to break the loop and the which loop
                System.out.print(i);
            }

            System.out.println();
        }

        for(int j=0;j<=5;j++){
            if(j==3)
                continue;
            System.out.print(j);
        }
// when the user wanted to jump the 3 rd iteration we need to use the keyword continue to skip it
    }
    // in the above program the user wanted to get the input according to the user when he enters the negative number the loops terminates

}