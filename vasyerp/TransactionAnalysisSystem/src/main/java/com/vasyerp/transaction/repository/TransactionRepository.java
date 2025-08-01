package com.vasyerp.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vasyerp.transaction.model.Transaction;

import java.util.List;
import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
    List<Transaction> findByUserIdOrderByTimestampAsc(Long userId);
}
