package com.exam.system;

public class Question {
	
	String questionId;
	String question;
	String option1;
	String option2;
	String option3;
	String option4;
	int rightOption;
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public int getRightOption() {
		return rightOption;
	}
	public void setRightOption(int rightOption) {
		this.rightOption = rightOption;
	}
	public Question(String questionId, String question, String option1, String option2, String option3, String option4,
			int rightOption) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.rightOption = rightOption;
	}
	@Override
	public String toString() {
		return questionId+"."+question+"\n"+"1. "+option1+"     "+"2. "+option2+"\n"+"3. "+option3+"     "+"4. "+option4;
	}

	
	
}
