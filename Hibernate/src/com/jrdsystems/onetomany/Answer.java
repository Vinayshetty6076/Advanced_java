package com.jrdsystems.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	private int answer_id;
	private String answer;
	
	@ManyToOne
	private Question question;
	
	public Answer() {
		super();
	}

	public Answer(int answer_id, String answer, Question question) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
		this.question = question;
	}



	public int getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
}
