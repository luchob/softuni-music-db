package bg.softuni.musicdb.repository;

import bg.softuni.musicdb.model.entities.ArticleEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity, Long> {

  Optional<ArticleEntity> findTopByOrderByCreatedOnDesc();
}
