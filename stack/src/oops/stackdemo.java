package oops;
public class stackdemo {
    private int s[]=new int[10];
   private int tos;
    stackdemo(){
        tos=-1;
    }
  public void push(int item){
        if(tos==9)
            System.out.print("stack.full");
        else{
        tos++;
        s[tos]=item;}

   }
  public int pop(){
        if(tos==-1){
            System.out.print("Stck empty");
            return -1;
        }
        else
        return s[tos--];

   }

}