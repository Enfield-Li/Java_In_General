import java.awt.Color;
import javax.swing.JFrame;

public class Myframe extends JFrame {

  Myframe() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("JFrame title");
    this.setResizable(false);
    this.setVisible(true); // visiblity
    this.setSize(420, 420); // size

    // this.getContentPane().setBackground(Color.GREEN);
    // this.getContentPane().setBackground(new Color(0, 0, 0));
    this.getContentPane().setBackground(new Color(0x12345));
    // Change Icon
    // ImageIcon image = new ImageIcon("xxx.png"); // create an imageIcon
    // this.setIconImage(image.getImage());

  }
}
