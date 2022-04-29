import exceptions.Exceptions;

public class App {

  public static void main(String[] args) {
    
    
    try {
      Exceptions.show();
    } catch (NullPointerException e) {
      System.out.println("error below");
      System.out.println(e);
    } catch (Exception e) {
      System.out.println("wrong");
    }
    System.exit(0);
  }
}
