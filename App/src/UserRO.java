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

  public void setError(UserRO.UserError error) {
    this.error = error;
  }

  public void setUser(UserRO.User user) {
    this.user = user;
  }
}
