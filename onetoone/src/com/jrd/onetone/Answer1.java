package com.jrd.onetone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer1 {
	@Id
	private int answer_id;
	private String answer;
	@OneToOne(mappedBy = "answer")
	private Question1 question;
	
	public Answer1() {
		super();
	}

	public Answer1(int answer_id, String answer, Question1 question) {
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

	public Question1 getQuestion() {
		return question;
	}

	public void setQuestion(Question1 question) {
		this.question = question;
	}
	
}