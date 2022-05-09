package profile;

import java.util.List;

public class userPosts {

  private Boolean hasMore;
  private List<Post> post;

  public userPosts() {}

  public userPosts(Boolean hasMore, List<Post> post) {
    this.hasMore = hasMore;
    this.post = post;
  }

  public Boolean isHasMore() {
    return this.hasMore;
  }

  public Boolean getHasMore() {
    return this.hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public List<Post> getPost() {
    return this.post;
  }

  public void setPost(List<Post> post) {
    this.post = post;
  }

  public userPosts hasMore(Boolean hasMore) {
    setHasMore(hasMore);
    return this;
  }

  public userPosts post(List<Post> post) {
    setPost(post);
    return this;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " hasMore='" +
      isHasMore() +
      "'" +
      ", post='" +
      getPost() +
      "'" +
      "}"
    );
  }
}
