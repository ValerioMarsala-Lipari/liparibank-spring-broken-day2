package com.lipari.bank.account;

import com.lipari.bank.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByIban(String iban);

    List<Account> findByBalanceGreaterThanEqual(BigDecimal minBalance);

    List<Account> findByBalanceLessThanEqual(BigDecimal maxBalance);

    List<Account> findByBalanceBetween(BigDecimal minBalance, BigDecimal maxBalance);
}
