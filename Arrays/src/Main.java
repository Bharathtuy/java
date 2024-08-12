import java.util.*;
public class Main {
    public static void main(String[] args) {
        int mark[]= new int[50];
        // new int just creates the 50 integer memory space
        // mark[] it is just notice it is array
        // int mark[]={5,6,5,8,4}
        // we can initializes like this
        // index start from 0
        mark[0]=34;
        System.out.println(mark[0]);
        //int two [][]=new int[3][4]
        int two[][] ={{34,35,36,0},
            {45,46,48,48},
            {0,0,0,0,}};
        // we store like this
        // we can store 12 integers in the 2d arrays
        System.out.println(two[0][0]);
    }
}