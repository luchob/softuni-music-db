package bg.softuni.musicdb.service.impl;

import bg.softuni.musicdb.model.view.ArticleViewModel;
import bg.softuni.musicdb.repository.ArticleRepository;
import bg.softuni.musicdb.service.ArticleService;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

  private final ModelMapper modelMapper;
  private final ArticleRepository articleRepository;

  public ArticleServiceImpl(ModelMapper modelMapper,
      ArticleRepository articleRepository) {
    this.modelMapper = modelMapper;
    this.articleRepository = articleRepository;
  }

  @Override
  public List<ArticleViewModel> findAllArticles() {
    return articleRepository.
        findAll().
        stream().
        map(ae -> {
          ArticleViewModel avm = modelMapper.map(ae, ArticleViewModel.class);
          avm.setAuthor(ae.getUserEntity().getUsername());
          return avm;
        }).
        collect(Collectors.toList());
  }
}
