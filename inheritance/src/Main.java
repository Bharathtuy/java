 class  employ{// base class,super,parent class
    private String name;
    private  double salary;
    employ(String n, double s ){
        name=n;
        salary=s;
    }
     employ( ){
         name=" ";
         salary=0.0;
     }

    public String getName(){
        return name;
     }
     public void setName(String n){
        name=n;
     }
     public double getSalary()
     {
         return salary;
     }
     public void setSalary(double s){
        salary=s;
     }
    public void raisesalary(double per){
        salary=salary+salary*per/100;
     }
 }
 class Manager extends  employ{ // derived , sub,child class
    double bonus;
    Manager(String n, double s, double b){

 super(n,s);
 bonus=b;}
     // we can't access the private variable by own child or derived class
     // we can done by using super class or using method bec methods are public
public void setbonus(double b){
    bonus=b;
        }
        public double getSalary(){// method overriding
        return super.getSalary()+bonus;//we can add the bonus by defining the another methods
            // super.getsalary refers to the getsalary method in base class
        }
    }


public class Main {
    public static void main(String[] args) {
        employ em1 = new employ("raj",4500.0);
        em1.raisesalary(10);
        System.out.println(em1.getSalary());
        Manager m1 = new Manager("raghu",6500.0,0.0);
        //  we can access all the methods and functions in base class  by derived class
    m1.setbonus(2000);
    System.out.println(m1.getSalary());
    }
}