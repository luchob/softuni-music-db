package bg.softuni.musicdb.service;

import bg.softuni.musicdb.model.entities.UserEntity;
import bg.softuni.musicdb.model.service.UserRegistrationServiceModel;

public interface UserService {

  void seedUsers();

  void registerAndLoginUser(UserRegistrationServiceModel serviceModel);

  boolean userNameExists(String username);

    UserEntity findByName(String username);

    UserEntity findById(Long id);
}
