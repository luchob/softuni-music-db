package bg.softuni.musicdb;

import bg.softuni.musicdb.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MusicDBApplicationInit implements CommandLineRunner {

  private final UserService userService;

  public MusicDBApplicationInit(UserService userService) {
    this.userService = userService;
  }

  @Override
  public void run(String... args) throws Exception {
    userService.seedUsers();
  }
}
