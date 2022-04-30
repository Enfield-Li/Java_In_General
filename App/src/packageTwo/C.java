package packageTwo;

import packageOne.*;

public class C {

  public String publicMsg = "pub msg";
  protected String protectedMsg = "protected msg";
  private String privateMsg = "private";
  String defaultMsg = "defalut msg"; // default access ie. same package access

  public static void main(String[] args) {
    Asub asub = new Asub();
    // System.out.println(asub.protectedMsg);  // not visible
  }
}
