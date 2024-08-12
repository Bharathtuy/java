import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
String a ="bit";
String b ="welcome";
String c;
c= a;
a=b;
b=c;
System.out.println(a);
System.out.println(b);


Scanner scan = new Scanner(System.in);
System.out.println("how are you ?");
String name =scan.nextLine();
System.out.println("how old are you");
int age = scan.nextInt();
System.out.println(name+ age);
System.out.println("you are just "+age);
System.out.println("enter your salary");
scan.nextLine();
String salary =scan.nextLine();
// in the nextLine function we have to note the one thing nextline function completely reads it until \n so we can't enter the another input
        // so we have to clear the scanner nextline function
        //but in int it reads only numeric portion but it have escape function so need not clear the scanner nextint function
System.out.println("you salary in k's"+salary);

    }
}