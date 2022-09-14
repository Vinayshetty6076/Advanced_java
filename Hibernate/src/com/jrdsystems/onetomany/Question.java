package com.jrdsystems.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question 
{
	@Id
	private int question_id;
	private String question;
	
	@OneToMany(mappedBy = "question")
	private List<Answer> answer;
	public Question() {
		super();
	}

	public Question(int question_id, String question, List<Answer> answer) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.answer = answer;
	}

	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
}
