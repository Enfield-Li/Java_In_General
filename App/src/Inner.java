public class Inner {

  String inner = "innerVar";

  public Inner() {}

  public Inner(String inner) {
    this.inner = inner;
  }

  public String getInner() {
    return this.inner;
  }

  public void setInner(String inner) {
    this.inner = inner;
  }

  public Inner inner(String inner) {
    setInner(inner);
    return this;
  }

  @Override
  public String toString() {
    return "{" + " inner='" + getInner() + "'" + "}";
  }
}
