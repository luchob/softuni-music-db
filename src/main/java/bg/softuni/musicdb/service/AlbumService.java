package bg.softuni.musicdb.service;

import bg.softuni.musicdb.model.entities.AlbumEntity;
import bg.softuni.musicdb.model.service.AlbumServiceModel;
import bg.softuni.musicdb.model.view.AlbumViewModel;

public interface AlbumService {
  void createAlbum(AlbumServiceModel serviceModel);

    AlbumViewModel findById(Long id);

    AlbumEntity findEntityById(Long albumId);
}
