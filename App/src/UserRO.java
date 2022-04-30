import java.util.Objects;

public class UserRO {

  public static class User {

    public String username;
    public String email;
  }

  public static class UserError {

    public String field;
    public String message;
  }

  public UserRO.UserError error;
  public UserRO.User user;

  public UserRO() {}

  public UserRO(UserRO.UserError error, UserRO.User user) {
    this.error = error;
    this.user = user;
  }

  public UserRO.UserError getError() {
    return this.error;
  }

  public void setError(UserRO.UserError error) {
    this.error = error;
  }

  public UserRO.User getUser() {
    return this.user;
  }

  public void setUser(UserRO.User user) {
    this.user = user;
  }

  public UserRO error(UserRO.UserError error) {
    setError(error);
    return this;
  }

  public UserRO user(UserRO.User user) {
    setUser(user);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof UserRO)) {
      return false;
    }
    UserRO userRO = (UserRO) o;
    return (
      Objects.equals(error, userRO.error) && Objects.equals(user, userRO.user)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, user);
  }

  @Override
  public String toString() {
    return (
      "{" + " error='" + getError() + "'" + ", user='" + getUser() + "'" + "}"
    );
  }
}
