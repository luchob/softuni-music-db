package bg.softuni.musicdb.repository;

import bg.softuni.musicdb.model.entities.ArtistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository  extends JpaRepository<ArtistEntity, Long>  {

}
