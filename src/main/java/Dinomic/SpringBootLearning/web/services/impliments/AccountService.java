package Dinomic.SpringBootLearning.web.services.impliments;

import Dinomic.SpringBootLearning.dom.Account;
import Dinomic.SpringBootLearning.web.repositories.IAccountRepository;
import Dinomic.SpringBootLearning.web.services.interfaces.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private IAccountRepository accountRepository;

    @Override
    public void addAccount(Account account) {

    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
