class  box{
    int len,hei,bre;
    box(int l , int b , int h){//constructor usually possess name of the class like construcot have name box and class have also same box
        // no return type
        len=l;
        hei=h;
        bre=b;
    }
    void setvalue(int l,int b, int h){
        len=l;
        hei=h;
        bre=b;
    }
    int vol()
    {
        return len*bre*hei;
    }
}
public class Main {
    public static void main(String[] args) {
        box black=new box(4,5,6);//now the value has assigned using constructor
        // we can change the value by using method
        //black =null; //1.deference
        black.setvalue(7,8,9);
        System.out.print(black.vol());
        // new box(4,4,4) //anonyms object

    }
}