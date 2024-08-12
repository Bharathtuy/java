class pass {
    int length;
    int b;
    int h;
    pass(int l,int b,int h){// this pointer used when the parameter and class variable have same name
        this.length=l;
        this.b=b;
        this.h=h;
    }
  pass  doube(){
        pass temp= new pass(length*2,b*2,h*2);

        return temp;
    }
    boolean is_equal(pass ba) {//call by reference  it does not create the other object it just go with same object
        ba.length++;
        if ((length != ba.length) || (b != ba.b) || (h != ba.h)) {
            return false;
        }
        return true;
    }
}
public class Main {
    static int increment(int a){
return a++;
    }// call by value
    // we check that the value of in main method is not incremeted by other method

    public static void main(String[] args) {
      int b=90;
      increment(b);
     System.out.print(b);

        pass box = new pass(4,5,6);
        pass ba= new pass(4,5,6);
        pass b3= ba.doube();
        System.out.print(box.is_equal(ba));
        System.out.print(b3.length);

    }
}