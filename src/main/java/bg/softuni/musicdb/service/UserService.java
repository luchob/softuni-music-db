package bg.softuni.musicdb.service;

import bg.softuni.musicdb.model.service.UserRegistrationServiceModel;

public interface UserService {

  void seedUsers();

  void registerAndLoginUser(UserRegistrationServiceModel serviceModel);

}
