package socialissuesproject;

import java.util.*;

public class SocialIssuesGame {
	public static void main(String[] args) {
		List<Question> myQuestions = new ArrayList<>();
		myQuestions.add(new Question("Are pinapples godo?", "false"));
		myQuestions.add(new Question("Banana is a fruit?", "true"));
		
		Trivia game = new Trivia(myQuestions);
		game.startGame();
		
		System.out.println("Good job!");
	}
}
