package bg.softuni.musicdb.web;

import bg.softuni.musicdb.model.view.AlbumViewModel;
import bg.softuni.musicdb.service.AlbumService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/albums")
@RestController
public class AlbumRestController {

  private final AlbumService albumService;

  public AlbumRestController(AlbumService albumService) {
    this.albumService = albumService;
  }

  @GetMapping("/api")
  public ResponseEntity<List<AlbumViewModel>> findAll() {
    return ResponseEntity
            .ok()
            .body(albumService.findAll());
  }
}
