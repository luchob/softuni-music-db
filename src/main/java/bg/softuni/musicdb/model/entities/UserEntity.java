package bg.softuni.musicdb.model.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity extends BaseEntity {

  @Column(nullable = false)
  private String username;

  @Column(nullable = false)
  private String password;

  @Column(nullable = false)
  private String fullname;

  @ManyToMany(fetch = FetchType.EAGER)
  private List<UserRoleEntity> roles = new ArrayList<>();

  public String getUsername() {
    return username;
  }

  public UserEntity setUsername(String name) {
    this.username = name;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public UserEntity setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getFullname() {
    return fullname;
  }

  public UserEntity setFullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

  public List<UserRoleEntity> getRoles() {
    return roles;
  }

  public UserEntity setRoles(List<UserRoleEntity> roles) {
    this.roles = roles;
    return this;
  }

  public UserEntity addRole(UserRoleEntity roleEntity) {
    this.roles.add(roleEntity);
    return this;
  }
}
