import java.util.Random;

public class App {

  public static void main(String[] args) {
    // $ [flags] [precision] [width] [conversion-character]

    boolean myBool = true; // %b
    char myChar = '@';     // %c
    String myStr = "afs";  // %s
    int myInt = 10;        // %d
    double myDb = 11000;   // %f   for float and double

    System.out.printf("%d here", 123);
  }
}
