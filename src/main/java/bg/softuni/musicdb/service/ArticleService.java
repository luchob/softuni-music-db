package bg.softuni.musicdb.service;

import bg.softuni.musicdb.model.view.ArticleViewModel;
import java.util.List;

public interface ArticleService {

  List<ArticleViewModel> findAllArticles();

}
