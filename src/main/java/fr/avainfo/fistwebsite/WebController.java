package fr.avainfo.fistwebsite;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import java.util.Date;

@Controller
public class WebController {

    @GetMapping(value = "/index")
    public String index(HttpSession session) {
        Date date = new Date();
        Long time = date.getTime();
        String t = time.toString();
        session.setAttribute("time", t);
        return "index";
    }

}
