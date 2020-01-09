package socialissuesproject;

import java.util.*;

public class Trivia {
	public List<Question> questions;
	public String userName;
	public int totalCorrect;
	public Scanner sc;
	
	public Trivia(List<Question> questions) {
		this.questions = questions;
		totalCorrect = 0;
		sc = new Scanner(System.in);
	}
	
	public void startGame() {
		userName = askUsername();
		play();
	}
	
	public void play() {
		Question currQuestion;
		String currAnswer;
		Iterator iter = questions.iterator();
		int i = 1;
		
		System.out.println("Hello, " + getUserName() + ", this is your first question (Answer true or false only!): ");
		while (iter.hasNext()) {
			currQuestion = (Question) iter.next();
			System.out.println("Your " + i + " question is: " + currQuestion.getQuestion());
			if (checkAnswer(currQuestion, getAnswer())) {
				updateScore();
			}
			i++;
		}
		finishGame();
	}
	
	public void finishGame() {
		outputScore();
	}
	
	private void outputScore() {
		System.out.println("Your score is " + getScore() + " out of " + questions.size() + "!");
	}
	
	public String getAnswer() {
		return sc.next();
	}
	
	public boolean checkAnswer(Question question, String answer) {
		return question.getAnswer().equals(answer.toLowerCase()) ? true : false; 
	}
	
	private void updateScore() {
		totalCorrect++;
	}
	
	private int getScore() {
		return totalCorrect;
	}
	
	public String askUsername() {
		System.out.println("What is your name? ");
		return sc.next();
	}
	
	public String getUserName() {
		return userName;
	}

}
