package fr.avainfo.fistwebsite.mvc;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {
    public static WebController instance;

    @PostConstruct
    public void onEnable() {
        WebController.instance = this;
    }

    @GetMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping(value = "/index")
    public String index(@ModelAttribute User user, Model model) {
        UserManager.addUsers(user);
        model.addAttribute("userF", UserManager.users);
        return "test";
    }

}
