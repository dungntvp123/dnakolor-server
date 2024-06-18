package com.dnakolor.account.repository;

import com.dnakolor.account.data.entity.AccountVerifyToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountVerifyTokenRepository extends JpaRepository<AccountVerifyToken, String> {
}
