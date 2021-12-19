package Dinomic.SpringBootLearning.security.controllers;

import Dinomic.SpringBootLearning.security.dom.Account;
import Dinomic.SpringBootLearning.security.dom.Authority;
import Dinomic.SpringBootLearning.security.dom.forms.SignUpForm;

import Dinomic.SpringBootLearning.security.repositories.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/auth")
public class AuthController {

//    @Autowired
//    AuthenticationManager authenticationManager;

    @Autowired
    IAccountRepository accountRepository;
//
//    @Autowired
//    RoleRepository roleRepository;
//
    @Autowired
    PasswordEncoder encoder;
//
//    @Autowired
//    JwtUtils jwtUtils;

    @GetMapping("/form")
    public String home(Model model){
        model.addAttribute("signUpForm", new SignUpForm());
        return "authForm";
    }

    @PostMapping("/process_register")
    public String processRegister(@ModelAttribute SignUpForm signUpForm) {
        String encodedPassword = encoder.encode(signUpForm.getPassword());
        Account account = new Account();
        account.setUsername(signUpForm.getUsername());
        account.setPassword(encodedPassword);
        List<Authority> authorities = new ArrayList<>();
        Authority authority = new Authority();
        authority.setAccount(account);
        authorities.add(authority);
        account.setAuthorities(authorities);
        account.setEmail(signUpForm.getEmail());
        accountRepository.save(account);
//        return "redirect:/user";
        return "redirect:/auth/form";
    }
}
