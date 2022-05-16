import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App {

  public static void main(String[] args) {
    JFrame frame = new JFrame(); // create a frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("JFrame title");
    frame.setResizable(false);
    frame.setVisible(true); // visiblity
    frame.setSize(420, 420); // size

    // frame.getContentPane().setBackground(Color.GREEN);
    // frame.getContentPane().setBackground(new Color(0, 0, 0));
    frame.getContentPane().setBackground(new Color(0x12345));
    // Change Icon
    // ImageIcon image = new ImageIcon("xxx.png"); // create an imageIcon
    // frame.setIconImage(image.getImage());

    new Myframe();
  }
}
