package bg.softuni.musicdb.repository;

import bg.softuni.musicdb.model.entities.UserRoleEntity;
import bg.softuni.musicdb.model.entities.enums.UserRole;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Long> {

  Optional<UserRoleEntity> findByRole(UserRole role);
}
