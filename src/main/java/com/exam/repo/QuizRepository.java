package com.exam.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.models.exam.Category;
import com.exam.models.exam.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{
	
	
	public List<Quiz> findBycategory(Category category);
	

	// new api to show only those quizes active 
	
	public List<Quiz> findByActive(Boolean b);
	/*
	// category wise or Active quiz 
	public List<Quiz> findByCatogoryAndActive(Category c, Boolean b);
	*/

}
