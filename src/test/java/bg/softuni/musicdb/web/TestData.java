package bg.softuni.musicdb.web;

import bg.softuni.musicdb.model.entities.AlbumEntity;
import bg.softuni.musicdb.model.entities.ArtistEntity;
import bg.softuni.musicdb.model.entities.UserEntity;
import bg.softuni.musicdb.model.entities.enums.Genre;
import bg.softuni.musicdb.repository.AlbumRepository;
import bg.softuni.musicdb.repository.ArtistRepository;
import bg.softuni.musicdb.repository.LogRepository;
import bg.softuni.musicdb.repository.UserRepository;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;

public class TestData {

  private UserRepository userRepository;
  private ArtistRepository artistRepository;
  private AlbumRepository albumRepository;
  private LogRepository logRepository;


  private long testAlbumId;

  public TestData(UserRepository userRepository,
      ArtistRepository artistRepository,
      AlbumRepository albumRepository, LogRepository logRepository) {
    this.userRepository = userRepository;
    this.artistRepository = artistRepository;
    this.albumRepository = albumRepository;
    this.logRepository = logRepository;
  }

  public void init() {
    ArtistEntity artistEntity = new ArtistEntity();
    artistEntity.setName("METALLICA");
    artistEntity.setCareerInformation("Some info about metallica");
    artistEntity = artistRepository.save(artistEntity);

    UserEntity userEntity = new UserEntity();
    userEntity.setUsername("pesho").setPassword("xyz").setFullname("petar petrov");
    userEntity = userRepository.save(userEntity);

    AlbumEntity albumEntity = new AlbumEntity();
    albumEntity.
        setName("JUSTICE FOR ALL").
        setImageUrl("https://upload.wikimedia.org/wikipedia/en/b/bd/Metallica_-_...And_Justice_for_All_cover.jpg").
        setVideoUrl("_fKAsvJrFes").
        setDescription("Sample description").
        setCopies(11).
        setPrice(BigDecimal.TEN).
        setReleaseDate(LocalDate.of(1988, 3, 3).atStartOfDay(ZoneId.systemDefault()).toInstant()).
        setGenre(Genre.METAL).
        setArtistEntity(artistEntity).
        setUserEntity(userEntity);

    albumEntity = albumRepository.save(albumEntity);
    testAlbumId = albumEntity.getId();
  }

  public void tearDown() {
    logRepository.deleteAll();
    albumRepository.deleteAll();
    artistRepository.deleteAll();
    userRepository.deleteAll();
  }

  public long getTestAlbumId() {
    return testAlbumId;
  }
}
