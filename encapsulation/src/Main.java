class box{
    int l;
    int b;
    int c;
    static  int co;
    box (int a, int b, int c){
        l=a;
       this. b=b;
       this.c=c;
     co++;
    }
    static {
        System.out.print("this is a message");
    }
    static void display(){
        System.out.print(co);
    }
}
public class Main {
    public static void main(String[] args) {
       box ab= new box(4,5,6);
       box ac=new box(7,8,9);
        box ad=new box(7,8,9);
System.out.print(box.co);
box.display();
// static method can't invoke by the object
 // inside the static method we can call only the static method
    }
}