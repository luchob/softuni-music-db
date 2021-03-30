package bg.softuni.musicdb.service.impl;

import bg.softuni.musicdb.model.entities.ArticleEntity;
import bg.softuni.musicdb.model.service.ArticleServiceModel;
import bg.softuni.musicdb.repository.ArticleRepository;
import bg.softuni.musicdb.service.ArticleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

  private final ArticleRepository articleRepository;
  private final ModelMapper modelMapper;

  public ArticleServiceImpl(ArticleRepository articleRepository,
      ModelMapper modelMapper) {
    this.articleRepository = articleRepository;
    this.modelMapper = modelMapper;
  }

  @Override
  public void createArticle(ArticleServiceModel serviceModel) {
    ArticleEntity articleEntity = modelMapper.map(serviceModel, ArticleEntity.class);
    articleRepository.save(articleEntity);
  }
}
