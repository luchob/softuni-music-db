package bg.softuni.musicdb.service;

import bg.softuni.musicdb.model.view.ArtistViewModel;
import java.util.List;

public interface ArtistService {

  //TODO: accepted practise?
  List<ArtistViewModel> findAllArtists();

  void seedArtists();

}
