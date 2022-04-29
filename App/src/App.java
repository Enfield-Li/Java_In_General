import javax.swing.JOptionPane;

public class App {

  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Enter your name");
    Integer age = Integer.parseInt(
      JOptionPane.showInputDialog("Enter your age")
    );
    Float height = Float.parseFloat(
      JOptionPane.showInputDialog("Enter your height")
    );

    JOptionPane.showMessageDialog(
      null,
      "hello " +
      name +
      " and you are " +
      age +
      " years old and you are " +
      height
    );
  }
}
