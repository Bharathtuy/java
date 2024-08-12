package busresveration;
import java.util.*;
public class busdemo {
    public static void main(String args[]){
        ArrayList<bus> buses= new ArrayList<bus>();
        ArrayList<book> bookings=new ArrayList<book>();
        buses.add(new bus(1,true,2));
        buses.add(new bus(2,true,75));
        buses.add(new bus(3,false,65));
        for( bus b:buses){
            b.displayinfo();
            System.out.println();
        }


        Scanner scan= new Scanner(System.in);
        int useropt=1;
        while(useropt==1) {
            System.out.println("Enter 1 to Book and 2 to Exit");
            useropt=scan.nextInt();
            if(useropt==1){
                book booking =new book();
                if(booking.available(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("your booking is confirmed");
                }
                else{
                    System.out.println("Sorry the seat are already taken");
                }
            }
        }
    }
}
