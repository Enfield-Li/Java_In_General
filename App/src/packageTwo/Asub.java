package packageTwo;

import packageOne.*;

public class Asub extends A {

  public static void main(String[] args) {
    Asub asub = new Asub();
    System.out.println(asub.protectedMsg);
  }
}
