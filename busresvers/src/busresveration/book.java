package busresveration;
import java.text.ParseException;
import  java.util.*;//nested packages / hierarchical package
import java.text.SimpleDateFormat;
public class book {
    String name;
    int busno;
    Date date;
    book(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Name");
        name=scan.next();
        System.out.println("Enter your Bus no ");
        busno=scan.nextInt();

        System.out.println("Enter your date");
        String datein=scan.next();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
      try{
       date= dateformat.parse(datein);
      }
      catch (ParseException e){
          e.printStackTrace();
      }
    }
    public boolean available(ArrayList<book> bookings,ArrayList<bus> buses){
    int capacity=0;
    for(bus bus:buses){
        if(bus.getBusno()==busno){
            capacity=bus.getCapacity();
        }

    }
    int booked=0;
    for(book b:bookings){
       if( b.busno==busno && b.date.equals(this.date)) {
           booked++;
        }
    }
    return booked<capacity?true:false;
    }
}
