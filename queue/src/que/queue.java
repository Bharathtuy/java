package que;

public class queue {

 public static void main(String args[]) {
     quedemo s1 = new quedemo();
     s1.enque(5);
     s1.enque(7);
     s1.deque();
     s1.enque(6);
     s1.deque();
     System.out.print(s1.s[0]);
 }
}
