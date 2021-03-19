package bg.softuni.musicdb.web;

import bg.softuni.musicdb.model.entities.UserEntity;
import bg.softuni.musicdb.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/test")
public class TestController {

    private final UserService userService;

    public TestController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/update")
    public String update(Principal principal, Model model){
        //ToDo: change entity
        UserEntity userEntity = userService
                .findByName(principal.getName());





        model.addAttribute("username", userEntity.getUsername());
        model.addAttribute("userId", userEntity.getId());

        return "test";

    }

    @PatchMapping("/update/{id}")
    public String updateConfirm(@PathVariable Long id){
        System.out.println();
        return "redirect:/home";
    }
}
