package que;

public class quedemo {
    int s[]=new int[5];
    int f=0;
    int l=0;
    void enque(int i){
        s[f]=i;
        f++;
    }
    void deque(){
        s[l]=s[++l];
        System.out.print(s[l]);
    }
}
