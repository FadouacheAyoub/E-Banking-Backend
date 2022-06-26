package me.fadouache.ebankingbackend.repositories;

import me.fadouache.ebankingbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    public List<BankAccount> findByCustomerId(Long accountId);
}
