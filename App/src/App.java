public class App {

  public static void main(String[] args) {
    // generic method
    Integer[] intArr = { 1, 2, 3 };
    String[] strArr = { "1", "2", "3" };
    Double[] dbArr = { 1.0, 2.0, 3.0 };

    displayArr(intArr);
    displayArr(strArr);
    displayArr(dbArr);

    getFirst(intArr);
    getFirst(strArr);
    getFirst(dbArr);

    // generic class
    // normal
    MyInt myInt = new MyInt(11);
    System.out.println(myInt.getValue());

    // generic
    MyThing<Integer> myThing = new MyThing<>(22);
    System.out.println(myThing.getValue());
  }

  public static <T> void displayArr(T[] arr) {
    for (T x : arr) {
      System.out.println(x);
    }
  }

  public static <T> T getFirst(T[] arr) {
    return arr[0];
  }
}
