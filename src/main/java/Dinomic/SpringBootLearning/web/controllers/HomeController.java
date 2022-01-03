package Dinomic.SpringBootLearning.web.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home(){
        return "home";
    }

    @GetMapping("/admin")
    public String homeAdmin(){
        return "home";
    }
}
