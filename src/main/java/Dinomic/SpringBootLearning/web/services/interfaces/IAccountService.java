package Dinomic.SpringBootLearning.web.services.interfaces;

import Dinomic.SpringBootLearning.dom.Account;

import java.util.List;

public interface IAccountService {
    void addAccount(Account account);

    List<Account> getAllAccounts();
}
