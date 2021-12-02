package Dinomic.SpringBootLearning.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
    @GetMapping("/signIn")
    public String signInHome(){
        return "signIn";
    }
}
