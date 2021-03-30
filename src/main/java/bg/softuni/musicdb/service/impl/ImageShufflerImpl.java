package bg.softuni.musicdb.service.impl;

import bg.softuni.musicdb.service.ImageShuffler;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ImageShufflerImpl implements ImageShuffler {
  @Override
  public void shuffle(List<String> images) {
    Collections.shuffle(images);
  }
}
