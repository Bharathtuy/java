import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int sth=scan.nextInt();
        int stm=scan.nextInt();
        int enh=scan.nextInt();
        int enm=scan.nextInt();
        float ans=(float)(enm-enh)/(stm-sth);
        System.out.print(ans);
//        int mins=0;
//        mins=60-(stm%60);
//        sth++;
//        mins=mins+(enh-sth)*60;
//        mins=mins+enm;
//        System.out.println(mins/60);
//        System.out.println(mins%60);

    }
}