package packageOne;

import packageTwo.*;

public class A {

  protected String protectedMsg = "protected msg";

  public static void main(String[] args) {
    C c = new C();
    // System.out.println(c.defaultMsg);
    System.out.println(c.publicMsg);

    B b = new B();
    // System.out.println(b.privateMsg); // private msg not visible
  }
}
