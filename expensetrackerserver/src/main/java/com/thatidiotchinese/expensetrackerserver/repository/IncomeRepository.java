package com.thatidiotchinese.expensetrackerserver.repository;

import com.thatidiotchinese.expensetrackerserver.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}
