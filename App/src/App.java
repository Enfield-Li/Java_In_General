import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App {

  public static void main(String[] args) {
    Integer[] intArr = { 1, 2, 3 };
    String[] strArr = { "1", "2", "3" };
    Double[] dbArr = { 1.0, 2.0, 3.0 };

    displayArr(intArr);
    displayArr(strArr);
    displayArr(dbArr);
  }

  public static <T> void displayArr(T[] arr) {
    for (T x : arr) {
      System.out.println(x);
    }
  }
}
