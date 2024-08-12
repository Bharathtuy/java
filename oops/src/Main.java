class box{
    int len,breadth,height;
    int volume(){
        return len*breadth*height;
    }
}
// we can create class access by using creating object called blackbox
// classes can access only with object
// we can create n number of object for one class
public class Main {
    public static void main(String[] args) {
       box blackbox=new box();
       box wood =new box();
       blackbox.len=10;
       blackbox.breadth=15;
       blackbox.height=25;
       wood.height=25;
       System.out.print(blackbox.volume());

    }
}