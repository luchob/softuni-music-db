package bg.softuni.musicdb.web;

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
  public ResponseEntity<List<AlbumViewModel>> findAll() {

    List<AlbumViewModel> albumViewModels = albumRepository.
        findAll().
        stream().
        map(ae -> {
          AlbumViewModel viewModel = modelMapper.map(ae, AlbumViewModel.class);
          viewModel.setArtist(ae.getArtistEntity().getName());
          return viewModel;
        }).
        collect(Collectors.toList());

    return ResponseEntity
            .ok()
            .body(albumViewModels);
  }
}
