package bg.softuni.musicdb.model.entities;

import bg.softuni.musicdb.model.entities.enums.Genre;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="articles")
public class ArticleEntity  extends BaseEntity {

  @Column(nullable = false)
  private String title;
  @Column(nullable = false)
  private String imageUrl;
  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private Genre genre;
  @Column(nullable = false)
  private String content;
  @ManyToOne
  private UserEntity userEntity;

  public String getTitle() {
    return title;
  }

  public ArticleEntity setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public ArticleEntity setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  public Genre getGenre() {
    return genre;
  }

  public ArticleEntity setGenre(Genre genre) {
    this.genre = genre;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ArticleEntity setContent(String content) {
    this.content = content;
    return this;
  }

  public UserEntity getUserEntity() {
    return userEntity;
  }

  public ArticleEntity setUserEntity(UserEntity userEntity) {
    this.userEntity = userEntity;
    return this;
  }

  @Override
  public String toString() {
    return "ArticleEntity{" +
        "title='" + title + '\'' +
        ", imageUrl='" + imageUrl + '\'' +
        ", genre=" + genre +
        ", content='" + content + '\'' +
        '}';
  }
}
