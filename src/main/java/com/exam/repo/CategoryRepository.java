package com.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.models.exam.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	Category save(Category category);

}
