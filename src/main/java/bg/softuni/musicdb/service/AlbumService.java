package bg.softuni.musicdb.service;

import bg.softuni.musicdb.model.entities.AlbumEntity;
import bg.softuni.musicdb.model.service.AlbumServiceModel;
import bg.softuni.musicdb.model.view.AlbumViewModel;
import java.util.List;

public interface AlbumService {

  void createAlbum(AlbumServiceModel serviceModel);

  AlbumViewModel findById(Long id);

  List<AlbumViewModel> findAll();

  AlbumEntity findEntityById(Long albumId);
}
