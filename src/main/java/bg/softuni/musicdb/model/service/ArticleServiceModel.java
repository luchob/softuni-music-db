package bg.softuni.musicdb.model.service;

import bg.softuni.musicdb.model.entities.enums.Genre;

public class ArticleServiceModel {

  private String title;
  private String imageUrl;
  private Genre genre;
  private String content;
  private String user;

  public String getTitle() {
    return title;
  }

  public ArticleServiceModel setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public ArticleServiceModel setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  public Genre getGenre() {
    return genre;
  }

  public ArticleServiceModel setGenre(Genre genre) {
    this.genre = genre;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ArticleServiceModel setContent(String content) {
    this.content = content;
    return this;
  }

  public String getUser() {
    return user;
  }

  public ArticleServiceModel setUser(String user) {
    this.user = user;
    return this;
  }

  @Override
  public String toString() {
    return "ArticleServiceModel{" +
        "title='" + title + '\'' +
        ", imageUrl='" + imageUrl + '\'' +
        ", genre=" + genre +
        ", content='" + content + '\'' +
        ", userName='" + user + '\'' +
        '}';
  }
}
