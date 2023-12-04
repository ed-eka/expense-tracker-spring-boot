package com.thatidiotchinese.expensetrackerserver.repository;

import com.thatidiotchinese.expensetrackerserver.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
