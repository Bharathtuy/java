package oops;
public class stack {
    public static void main(String args[]){
        stackdemo s1=new stackdemo();
        s1.push(5);
        s1.push(6);

        System.out.print(s1.pop());
        //System.out.print(s1.s[0]);
        // here data becomes private so you have to access the by using the methods defined in it
    }
}