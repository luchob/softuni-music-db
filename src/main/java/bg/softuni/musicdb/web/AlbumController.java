package bg.softuni.musicdb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/albums")
public class AlbumController {

  @GetMapping("/add")
  public String addAlbum() {
    return "add-album";
  }

}
