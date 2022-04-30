public class MyThing<T, V> {

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
