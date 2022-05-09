package profile;

import java.util.Date;

public class User {

  private Long id;
  private Date createdAt;
  private String username;
  private String email;
  private Integer postAmounts;

  public User() {}

  public User(
    Long id,
    Date createdAt,
    String username,
    String email,
    Integer postAmounts
  ) {
    this.id = id;
    this.createdAt = createdAt;
    this.username = username;
    this.email = email;
    this.postAmounts = postAmounts;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getPostAmounts() {
    return this.postAmounts;
  }

  public void setPostAmounts(Integer postAmounts) {
    this.postAmounts = postAmounts;
  }

  public User id(Long id) {
    setId(id);
    return this;
  }

  public User createdAt(Date createdAt) {
    setCreatedAt(createdAt);
    return this;
  }

  public User username(String username) {
    setUsername(username);
    return this;
  }

  public User email(String email) {
    setEmail(email);
    return this;
  }

  public User postAmounts(Integer postAmounts) {
    setPostAmounts(postAmounts);
    return this;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " id='" +
      getId() +
      "'" +
      ", createdAt='" +
      getCreatedAt() +
      "'" +
      ", username='" +
      getUsername() +
      "'" +
      ", email='" +
      getEmail() +
      "'" +
      ", postAmounts='" +
      getPostAmounts() +
      "'" +
      "}"
    );
  }
}
