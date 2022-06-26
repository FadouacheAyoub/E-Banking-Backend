package me.fadouache.ebankingbackend.repositories;

import me.fadouache.ebankingbackend.entities.AccountOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository<AccountOperation, Long> {
    public List<AccountOperation> findByBankAccountId(String accountId);

    public Page<AccountOperation> findByBankAccountIdOrderByDateOperationDesc(String accountId, Pageable pageable);
}