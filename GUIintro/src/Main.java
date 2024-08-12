import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null,name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null,age);
        //joption is always taken the input as string so we have to double by using above method
        double salary =Double.parseDouble(JOptionPane.showInputDialog("enter your salary"));
        JOptionPane.showMessageDialog(null,salary);

    }
}