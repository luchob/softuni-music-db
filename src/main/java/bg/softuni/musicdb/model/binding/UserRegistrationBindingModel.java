package bg.softuni.musicdb.model.binding;

public class UserRegistrationBindingModel {

  private String username;
  private String email;
  private String fullname;
  private String password;
  private String confirmPassword;

  public String getUsername() {
    return username;
  }

  public UserRegistrationBindingModel setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public UserRegistrationBindingModel setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getFullname() {
    return fullname;
  }

  public UserRegistrationBindingModel setFullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public UserRegistrationBindingModel setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getConfirmPassword() {
    return confirmPassword;
  }

  public UserRegistrationBindingModel setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
    return this;
  }
}
