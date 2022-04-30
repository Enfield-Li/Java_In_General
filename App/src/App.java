import java.util.Random;

public class App {

  public static void main(String[] args) {
    UserRO res = genUserInfoRO("username", "email");
    UserRO res2 = genUserErrorRO("fieldOne", "msg1");

    System.out.println(res2.toString());
    System.out.println(res.toString());
  }

  private static UserRO genUserInfoRO(String username, String email) {
    UserRO res = new UserRO();

    UserRO.User user = new UserRO.User();
    user.username = username;
    user.email = email;

    res.setUser(user);
    return res;
  }

  private static UserRO genUserErrorRO(String field, String message) {
    UserRO res = new UserRO();

    UserRO.UserError error = new UserRO.UserError();
    error.field = field;
    error.message = message;

    res.setError(error);
    return res;
  }
}
