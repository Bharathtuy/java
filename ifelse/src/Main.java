public class Main {
    public static void main(String[] args) {
        int age=90;
        // suppose if statement executed the program ended there is no need to check the other conditions
        if(age>=90){
            System.out.println("hello old man");
        }
        else if(age<=90){
            System.out.println("hello uncle");
        }
        else if(age<=30){
            System.out.println("hello young man");
        }
        else{
            System.out.println("hello bae");
        }
    }
}