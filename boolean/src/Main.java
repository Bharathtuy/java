public class Main {
    public static void main(String[] args) {
     boolean a=true;
     boolean b=false;
     System.out.println(a&b);
     //boolean operators
        System.out.println(a|b);
        System.out.println(!a);

        // short end operators
        //for example if in or first value is true there is no need of checking the other values
    int g=12;
    int y=45;     //true   || false
    System.out.println(g>0 || y<45);
        // it checks only the first condition is true it does not check the other value
        System.out.println(g>0 && y<45);
        //it checks both the condtions because first con is true so you have to check the next condition
    }
}