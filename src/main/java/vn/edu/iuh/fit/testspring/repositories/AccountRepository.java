package vn.edu.iuh.fit.testspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.testspring.models.Account;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByBalanceGreaterThan(double amount, Pageable pageable);
}
