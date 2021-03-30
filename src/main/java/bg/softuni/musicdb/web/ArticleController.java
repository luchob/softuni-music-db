package bg.softuni.musicdb.web;

import bg.softuni.musicdb.model.binding.ArticleAddBindingModel;
import bg.softuni.musicdb.model.service.ArticleServiceModel;
import javax.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/articles")
public class ArticleController {

  private final ModelMapper modelMapper;

  public ArticleController(ModelMapper modelMapper) {
    this.modelMapper = modelMapper;
  }

  @GetMapping("/all")
  public String addAlbum(Model model) {

//    model.addAttribute("artists",
//        artistService.findAllArtists());

    return "all-articles";
  }

  @GetMapping("/add")
  public String addArticle(Model model) {

//    model.addAttribute("artists",
//        artistService.findAllArtists());

    return "add-article";
  }

  @PostMapping("/add")
  public String addAlbum(@Valid ArticleAddBindingModel articleAddBindingModel,
      BindingResult bindingResult,
      RedirectAttributes redirectAttributes) {


    if(bindingResult.hasErrors()){
      redirectAttributes.addFlashAttribute("articleAddBindingModel", articleAddBindingModel);
      redirectAttributes
          .addFlashAttribute("org.springframework.validation.BindingResult.articleAddBindingModel", bindingResult);

      return "redirect:/article/add";
    }


    ArticleServiceModel articleServiceModel = modelMapper.map(
        articleAddBindingModel,
        ArticleServiceModel.class);



    return "redirect:/article/add";
  }

}
