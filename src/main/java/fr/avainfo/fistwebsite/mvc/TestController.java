package fr.avainfo.fistwebsite.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class TestController {

    @GetMapping(value = "/test")
    @ResponseBody
    public String test() {
        StringBuilder str = new StringBuilder();

        return str.toString();
    }

}
