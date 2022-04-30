import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class App {

  public static void main(String[] args) {
    File file = new File("App\\src\\test.txt");

    if (file.exists()) {
      System.out.println("exist");
    } else {
      System.out.println("doesn't exist");
    }

    try {
      FileWriter writter = new FileWriter("App\\src\\test.txt");
      writter.write("new stuff");
      // writter.append();
      writter.close();
    } catch (Exception e) {
      System.out.println("catch no writter file");
    }

    try {
      FileReader reader = new FileReader("App\\src\\test.txt");
      int data = reader.read();

      while (data != -1) {
        System.out.print((char) data);
        data = reader.read();
      }

      reader.close();
    } catch (Exception e) {
      System.out.println("catch no reader file");
    }
  }
}
