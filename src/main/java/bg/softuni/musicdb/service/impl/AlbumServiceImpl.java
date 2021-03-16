package bg.softuni.musicdb.service.impl;

import bg.softuni.musicdb.model.entities.AlbumEntity;
import bg.softuni.musicdb.model.entities.UserEntity;
import bg.softuni.musicdb.model.service.AlbumServiceModel;
import bg.softuni.musicdb.repository.AlbumRepository;
import bg.softuni.musicdb.repository.UserRepository;
import bg.softuni.musicdb.service.AlbumService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl implements AlbumService {

  private final AlbumRepository albumRepository;
  private final UserRepository userRepository;
  private final ModelMapper modelMapper;

  public AlbumServiceImpl(AlbumRepository albumRepository,
      UserRepository userRepository,
      ModelMapper modelMapper) {
    this.albumRepository = albumRepository;
    this.userRepository = userRepository;
    this.modelMapper = modelMapper;
  }

  @Override
  public void createAlbum(AlbumServiceModel serviceModel) {
    AlbumEntity albumEntity = modelMapper.map(serviceModel, AlbumEntity.class);
    UserEntity creator = userRepository.
        findByUsername(serviceModel.getUserName()).
        orElseThrow(() -> new IllegalArgumentException("Creator " + serviceModel.getUserName() + " could not be found"));
    albumEntity.setUserEntity(creator);

    albumRepository.save(albumEntity);
  }
}
