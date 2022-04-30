public class MyThing<T> {

  private T x;

  MyThing(T x) {
    this.x = x;
  }

  public T getValue() {
    return x;
  }
}
