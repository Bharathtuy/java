class pass{
    int length ;
    int b;
    int h;
   pass(int l,int b,int h){// this pointer used when the parameter and class variable have same name
       this.length=l;
       this.b=b;
       this.h=h;
   }
   pass(pass ba){// copy constructor
       length= ba.length;
       b=ba.b;
       h= ba.h;
   }
   boolean is_equal(pass ba){
       if((length!=ba.length)||(b!=ba.b)||(h!=ba.h)){
           return false;
       }
       return true;
   }


}
public class Main {
    public static void main(String[] args) {
       pass box = new pass(4,5,6);
       pass ba= new pass(4,5,6);

System.out.print(box.is_equal(ba));// passing object as a parameter
        // this means box object checks ba is equal or not
        //recieve an object by a class
        pass b3 = new pass(ba);
        System.out.print(b3.b);

    }
}