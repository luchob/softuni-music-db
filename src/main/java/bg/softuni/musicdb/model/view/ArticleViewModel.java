package bg.softuni.musicdb.model.view;

import bg.softuni.musicdb.model.entities.enums.Genre;

public class ArticleViewModel {

  private String title;
  private String imageUrl;
  private Genre genre;
  private String content;
  private String author;

  public String getTitle() {
    return title;
  }

  public ArticleViewModel setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public ArticleViewModel setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  public Genre getGenre() {
    return genre;
  }

  public ArticleViewModel setGenre(Genre genre) {
    this.genre = genre;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ArticleViewModel setContent(String content) {
    this.content = content;
    return this;
  }

  public String getAuthor() {
    return author;
  }

  public ArticleViewModel setAuthor(String author) {
    this.author = author;
    return this;
  }
}
