package com.exam.service.impl;



import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.models.exam.Question;
import com.exam.models.exam.Quiz;
import com.exam.repo.QuestionRepository;
import com.exam.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	
	@Autowired
	
	private QuestionRepository questionRepository;
	
		
	
	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionRepository.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionRepository.save(question);
	}

	@Override
	public Set<Question> getQuestions() {
		// TODO Auto-generated method stub
		return new HashSet<>(this.questionRepository.findAll());
		//return null;
	}

	@Override
	public Question getQuestion(Long questionId) {
		// TODO Auto-generated method stub
		return this.questionRepository.findById(questionId).get();
		//return null;
	}

	@Override
	public Set<Question> getQuestionsOfQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.questionRepository.findByQuiz(quiz);
	}

	@Override
	public void deleteQuestion(Long quesId) {
		// TODO Auto-generated method stub
		
		Question question = new Question();
		question.setQuesId(quesId);
		this.questionRepository.delete(question);
		
	}

}
