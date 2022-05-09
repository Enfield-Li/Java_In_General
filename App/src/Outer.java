public class Outer {

  String outerVar = "outerVar";
  Inner inner;

  public Outer() {}

  public Outer(String outerVar, Inner inner) {
    this.outerVar = outerVar;
    this.inner = inner;
  }

  public String getOuterVar() {
    return this.outerVar;
  }

  public void setOuterVar(String outerVar) {
    this.outerVar = outerVar;
  }

  public Inner getInner() {
    return this.inner;
  }

  public void setInner(Inner inner) {
    this.inner = inner;
  }

  public Outer outerVar(String outerVar) {
    setOuterVar(outerVar);
    return this;
  }

  public Outer inner(Inner inner) {
    setInner(inner);
    return this;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " outerVar='" +
      getOuterVar() +
      "'" +
      ", inner='" +
      getInner() +
      "'" +
      "}"
    );
  }
}
