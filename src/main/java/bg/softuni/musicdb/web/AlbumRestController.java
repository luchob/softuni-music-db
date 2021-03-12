package bg.softuni.musicdb.web;

import bg.softuni.musicdb.model.view.AlbumViewModel;
import bg.softuni.musicdb.repository.AlbumRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
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
  public List<AlbumViewModel> findAll() {
    return albumRepository.
        findAll().
        stream().
        map(ae -> modelMapper.map(ae, AlbumViewModel.class)).
        collect(Collectors.toList());
  }
}
