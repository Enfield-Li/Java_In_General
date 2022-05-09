package profile;

public class Post {

  private Long id;
  private String title;
  private String content;

  public Post() {}

  public Post(Long id, String title, String content) {
    this.id = id;
    this.title = title;
    this.content = content;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Post id(Long id) {
    setId(id);
    return this;
  }

  public Post title(String title) {
    setTitle(title);
    return this;
  }

  public Post content(String content) {
    setContent(content);
    return this;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " id='" +
      getId() +
      "'" +
      ", title='" +
      getTitle() +
      "'" +
      ", content='" +
      getContent() +
      "'" +
      "}"
    );
  }
}
