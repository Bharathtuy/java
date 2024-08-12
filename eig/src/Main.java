import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        char r=h.next().charAt(0);
        char s=h.next().charAt(0);
        int ans=0;
        int f=0;
        int f1=0;
        if(r=='a'||r=='A'||r=='e'||r=='E'||r=='i'||r=='I'||r=='o'||r=='O'||r=='u'||r=='U'){
            f=1;
        }
        if(s=='a'||s=='A'||s=='e'||s=='E'||s=='i'||s=='I'||s=='o'||s=='O'||s=='u'||s=='U'){
            f1=1;
        }
        if(f==1 && f1==1){
            ans=s+r;
        }
        else if(f==0 && f1==0){
            ans=s*r;
        }
        else if(f==0||f1==0){
            ans=Math.abs(s-r);
        }
        System.out.println(ans);
    }
}