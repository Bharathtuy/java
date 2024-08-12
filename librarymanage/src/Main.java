class user{
    String name;
    String rollno;
    String dept;
}
class Bokk{
    int bookid;
    String bookname;
    int copies;
}
class card{
    int validity;
    int dueamount;
}
class message{
    String message;
}
public class Main {
    public static void main(String[] args) {
        user use=new user();
        use.name="bharath";
        use.rollno="7376221Cs125";
        use.dept="CSE";
                Bokk book=new Bokk();
        book.bookid=125;
        book.bookname="Harry Potter";
        book.copies=18;
        card car=new card();
        car.validity=12;
        car.dueamount=128;
        System.out.println("Hey "+use.name);
        System.out.println("your roll no is "+use.rollno);
        System.out.println("you from the department of "+use.dept);
        System.out.println("book id is  "+book.bookid);
        System.out.println("book copies is  "+book.copies);
        System.out.println("book name is  "+book.bookname);
        System.out.println("card validity is  "+car.validity);
        System.out.println("balance dueamount is is  "+car.dueamount);
    }
}