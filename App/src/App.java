import java.util.Random;

public class App {

  public static void main(String[] args) {
    UserRO userRO = new UserRO();
    UserRO userRO2 = new UserRO();

    UserRO res = genUserInfoRO(userRO, "username", "email");
    UserRO res2 = genUserErrorRO(userRO2, "fieldOne", "msg1");

    System.out.println(res.error);
    System.out.println(res2.toString());

    UserRO userRO3 = new UserRO();
    UserRO.UserError error = new UserRO.UserError();
    error.field = "fiel";
    error.message = "adsfa";
    userRO3.error = error;
    // userRO3.setError(error);
    System.out.println(userRO3.error);
  }

  private static UserRO genUserInfoRO(
    UserRO userRO,
    String username,
    String email
  ) {
    UserRO.User user = new UserRO.User();
    user.username = username;
    user.email = email;

    userRO.setUser(user);
    return userRO;
  }

  private static UserRO genUserErrorRO(
    UserRO userRO,
    String field,
    String message
  ) {
    UserRO.UserError error = new UserRO.UserError();
    error.field = field;
    error.message = message;

    userRO.setError(error);
    return userRO;
  }
}
