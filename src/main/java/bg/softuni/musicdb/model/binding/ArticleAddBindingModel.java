package bg.softuni.musicdb.model.binding;

import bg.softuni.musicdb.model.entities.enums.Genre;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ArticleAddBindingModel {

  @NotEmpty
  @Size(min = 3, max = 20)
  private String title;
  @NotEmpty
  @Size(min = 5)
  private String imageUrl;
  @NotNull
  private Genre genre;
  @NotEmpty
  @Size(min = 5)
  private String content;

  public String getTitle() {
    return title;
  }

  public ArticleAddBindingModel setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public ArticleAddBindingModel setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  public Genre getGenre() {
    return genre;
  }

  public ArticleAddBindingModel setGenre(Genre genre) {
    this.genre = genre;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ArticleAddBindingModel setContent(String content) {
    this.content = content;
    return this;
  }

  @Override
  public String toString() {
    return "ArticleAddBindingModel{" +
        "title='" + title + '\'' +
        ", imageUrl='" + imageUrl + '\'' +
        ", genre=" + genre +
        ", content='" + content + '\'' +
        '}';
  }
}
