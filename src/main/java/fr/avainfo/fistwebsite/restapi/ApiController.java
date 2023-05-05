package fr.avainfo.fistwebsite.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/songs")
    public int songs(@RequestParam(value = "parms1") Integer parms1) {
        System.out.println(parms1.getClass().getName());
        return parms1;
    }

}
