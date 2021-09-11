package Dinomic.SpringBootLearning.web.repositories;

import Dinomic.SpringBootLearning.dom.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository  extends JpaRepository<Account, Long> {
}
