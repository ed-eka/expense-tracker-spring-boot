package com.thatidiotchinese.expensetrackerserver.repository;

import com.thatidiotchinese.expensetrackerserver.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
