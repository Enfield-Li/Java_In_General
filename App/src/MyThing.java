public class MyThing<T extends Number, V> {

  // extends makes sure only accept number data type

  private T x;
  private V y;

  MyThing(T x, V y) {
    this.x = x;
    this.y = y;
  }

  public T getValue() {
    return x;
  }
}
