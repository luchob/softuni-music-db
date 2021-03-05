package bg.softuni.musicdb.model.entities;

import bg.softuni.musicdb.model.entities.enums.Genre;
import java.math.BigDecimal;
import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="albums")
public class AlbumEntity extends BaseEntity {

  @Column(nullable = false)
  private String name;
  @Column(nullable = false)
  private String imageUrl;
  private String videoUrl;
  @Column(nullable = false)
  private String description;
  @Column(nullable = false)
  private Integer copies;
  @Column(nullable = false)
  private BigDecimal price;
  @Column(nullable = false)
  private Instant releaseDate;
  @Enumerated(EnumType.STRING)
  private Genre genre;
  @ManyToOne
  private ArtistEntity artistEntity;
  @ManyToOne
  private UserEntity userEntity;

  public String getName() {
    return name;
  }

  public AlbumEntity setName(String name) {
    this.name = name;
    return this;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public AlbumEntity setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  public String getVideoUrl() {
    return videoUrl;
  }

  public AlbumEntity setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public AlbumEntity setDescription(String description) {
    this.description = description;
    return this;
  }

  public Integer getCopies() {
    return copies;
  }

  public AlbumEntity setCopies(Integer copies) {
    this.copies = copies;
    return this;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public AlbumEntity setPrice(BigDecimal price) {
    this.price = price;
    return this;
  }

  public Instant getReleaseDate() {
    return releaseDate;
  }

  public AlbumEntity setReleaseDate(Instant releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  public Genre getGenre() {
    return genre;
  }

  public AlbumEntity setGenre(Genre genre) {
    this.genre = genre;
    return this;
  }

  public ArtistEntity getArtistEntity() {
    return artistEntity;
  }

  public AlbumEntity setArtistEntity(ArtistEntity artistEntity) {
    this.artistEntity = artistEntity;
    return this;
  }

  public UserEntity getUserEntity() {
    return userEntity;
  }

  public AlbumEntity setUserEntity(UserEntity userEntity) {
    this.userEntity = userEntity;
    return this;
  }
}
