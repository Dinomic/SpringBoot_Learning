package Dinomic.SpringBootLearning.web.controllers;

import Dinomic.SpringBootLearning.security.dom.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
//
//    @Autowired
//    private IAccountService accountService;
//
//    @GetMapping(value = "/test")
//    public ResponseEntity<String> testGet(){
//        List<Account> accounts = accountService.getAllAccounts();
//        accounts.stream().forEach(a -> System.out.println(a.getAccountId()));
//
//        return ResponseEntity.ok("okeokeoke");
//    }
}
