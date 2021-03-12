package bg.softuni.musicdb.model.view;

import bg.softuni.musicdb.model.entities.enums.Genre;
import java.math.BigDecimal;
import java.time.Instant;

public class AlbumViewModel {

  private String name;
  private String imageUrl;
  private String videoUrl;
  private String description;
  private Integer copies;
  private BigDecimal price;
  private Instant releaseDate;
  private Genre genre;

  public AlbumViewModel(String name, String imageUrl, String videoUrl, String description,
      Integer copies, BigDecimal price, Instant releaseDate,
      Genre genre) {
    this.name = name;
    this.imageUrl = imageUrl;
    this.videoUrl = videoUrl;
    this.description = description;
    this.copies = copies;
    this.price = price;
    this.releaseDate = releaseDate;
    this.genre = genre;
  }

  public String getName() {
    return name;
  }

  public AlbumViewModel setName(String name) {
    this.name = name;
    return this;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public AlbumViewModel setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  public String getVideoUrl() {
    return videoUrl;
  }

  public AlbumViewModel setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public AlbumViewModel setDescription(String description) {
    this.description = description;
    return this;
  }

  public Integer getCopies() {
    return copies;
  }

  public AlbumViewModel setCopies(Integer copies) {
    this.copies = copies;
    return this;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public AlbumViewModel setPrice(BigDecimal price) {
    this.price = price;
    return this;
  }

  public Instant getReleaseDate() {
    return releaseDate;
  }

  public AlbumViewModel setReleaseDate(Instant releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  public Genre getGenre() {
    return genre;
  }

  public AlbumViewModel setGenre(Genre genre) {
    this.genre = genre;
    return this;
  }
}
