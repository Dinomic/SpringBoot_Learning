package Dinomic.SpringBootLearning.security.repositories;

import Dinomic.SpringBootLearning.security.dom.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAccountRepository  extends JpaRepository<Account, Long> {

    Optional<Account> findByUsername(String username);
}
