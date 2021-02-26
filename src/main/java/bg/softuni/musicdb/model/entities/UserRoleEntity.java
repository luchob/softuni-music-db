package bg.softuni.musicdb.model.entities;

import bg.softuni.musicdb.model.entities.enums.UserRole;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class UserRoleEntity extends BaseEntity {

  @Enumerated(EnumType.STRING)
  private UserRole role;

  public UserRole getRole() {
    return role;
  }

  public UserRoleEntity setRole(UserRole role) {
    this.role = role;
    return this;
  }
}
