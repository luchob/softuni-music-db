package bg.softuni.musicdb.service;

import bg.softuni.musicdb.model.entities.ArtistEntity;
import bg.softuni.musicdb.model.view.ArtistViewModel;
import java.util.List;

public interface ArtistService {

  List<String> findAllArtists();

  void seedArtists();

    ArtistEntity findByName(String artist);
}
