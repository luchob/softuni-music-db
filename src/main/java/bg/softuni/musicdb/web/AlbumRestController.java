package bg.softuni.musicdb.web;

import bg.softuni.musicdb.model.entities.AlbumEntity;
import bg.softuni.musicdb.model.view.AlbumViewModel;
import bg.softuni.musicdb.repository.AlbumRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/albums")
@RestController
public class AlbumRestController {

  private final AlbumRepository albumRepository;
  private final ModelMapper modelMapper;

  public AlbumRestController(AlbumRepository albumRepository,
      ModelMapper modelMapper) {
    this.albumRepository = albumRepository;
    this.modelMapper = modelMapper;
  }

  @GetMapping("/api")
  public ResponseEntity<List<AlbumEntity>> findAll() {
    return ResponseEntity
            .ok()
            .body(albumRepository.findAll());
  }
}
