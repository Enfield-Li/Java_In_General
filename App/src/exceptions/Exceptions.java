package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Exceptions {

  public static void show() {
    FileReader reader = null;

    try {
      reader = new FileReader("new one");
      System.out.println("File found here");
      new SimpleDateFormat().parse("");
    } catch (IOException | ParseException e) {
      IOException ex = new FileNotFoundException("no such file");

      System.out.println(ex.getMessage());

      e.printStackTrace();
    } finally {
      System.out.println("Starts final");
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      System.out.println("That's all");
    }
    // sayHello(null);
  }

  public static void sayHello(String name) {
    System.out.println(name.toUpperCase());
  }
}
