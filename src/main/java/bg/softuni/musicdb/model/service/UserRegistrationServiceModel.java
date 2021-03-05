package bg.softuni.musicdb.model.service;

public class UserRegistrationServiceModel {

  private String username;
  private String email;
  private String fullname;
  private String password;


  public String getUsername() {
    return username;
  }

  public UserRegistrationServiceModel setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public UserRegistrationServiceModel setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getFullname() {
    return fullname;
  }

  public UserRegistrationServiceModel setFullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public UserRegistrationServiceModel setPassword(String password) {
    this.password = password;
    return this;
  }
}
