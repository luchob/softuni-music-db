package bg.softuni.musicdb.model.binding;

import bg.softuni.musicdb.model.entities.enums.Genre;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

public class AlbumAddBindingModel {
  private Genre genre;

  private String name;
  private String imageUrl;
  private String videoUrl;
  private String description;
  private Integer copies;
  private BigDecimal price;
  private LocalDate releaseDate;
  private String artist;

  @NotNull
  public Genre getGenre() {
    return genre;
  }

  public AlbumAddBindingModel setGenre(Genre genre) {
    this.genre = genre;
    return this;
  }

  @Size(min = 5, max = 20)
  public String getName() {
    return name;
  }

  public AlbumAddBindingModel setName(String name) {
    this.name = name;
    return this;
  }


  public String getImageUrl() {
    return imageUrl;
  }

  public AlbumAddBindingModel setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  public String getVideoUrl() {
    return videoUrl;
  }

  public AlbumAddBindingModel setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  @Size(min = 5)
  public String getDescription() {
    return description;
  }

  public AlbumAddBindingModel setDescription(String description) {
    this.description = description;
    return this;
  }

  @Min(0)
  public Integer getCopies() {
    return copies;
  }

  public AlbumAddBindingModel setCopies(Integer copies) {
    this.copies = copies;
    return this;
  }

  @DecimalMin("0")
  public BigDecimal getPrice() {
    return price;
  }

  public AlbumAddBindingModel setPrice(BigDecimal price) {
    this.price = price;
    return this;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public AlbumAddBindingModel setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  @Override
  public String toString() {
    return "AlbumAddBindingModel{" +
        "genre=" + genre +
        ", name='" + name + '\'' +
        ", imageUrl='" + imageUrl + '\'' +
        ", videoUrl='" + videoUrl + '\'' +
        ", description='" + description + '\'' +
        ", copies=" + copies +
        ", price=" + price +
        ", releaseDate=" + releaseDate +
        '}';
  }

  public String getArtist() {
    return artist;
  }

  public AlbumAddBindingModel setArtist(String artist) {
    this.artist = artist;
    return this;
  }
}
