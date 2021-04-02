package bg.softuni.musicdb.service;

import bg.softuni.musicdb.model.service.ArticleServiceModel;
import bg.softuni.musicdb.model.view.ArticleViewModel;
import java.util.List;
import java.util.Optional;

public interface ArticleService {

  Optional<ArticleViewModel> findLatestArticle();

  List<ArticleViewModel> findAllArticles();

  void createArticle(ArticleServiceModel articleServiceModel);

}
