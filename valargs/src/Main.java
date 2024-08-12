public class Main {
    static int minvalue(int... value){// we can give n numbers as a arguements compiler will makes as an array
        //varargs should be initialzied last
        int min=Integer.MAX_VALUE;// max value of int c
        for(int i :value)
        {
            if(min>i){
                min=i;
            }
        }
        return min;
    }
    static double minvalue(double... value){// we can give n numbers as a arguements compiler will makes as an array
        //varargs should be initialzied last
        double min=Double.MAX_VALUE;// max value of int c
        for(double i :value)
        {
            if(min>i){
                min=i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.print(minvalue(4,5,6,3));
        System.out.print(minvalue());
    }
}