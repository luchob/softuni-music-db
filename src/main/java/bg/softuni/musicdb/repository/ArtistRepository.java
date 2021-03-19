package bg.softuni.musicdb.repository;

import bg.softuni.musicdb.model.entities.ArtistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<ArtistEntity, Long>  {

    @Query("SELECT a.name FROM ArtistEntity a")
    List<String> findAllArtistNames();

    Optional<ArtistEntity> findByName(String name);
}
