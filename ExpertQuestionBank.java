package EPIC;

import java.util.Random;
import java.util.Scanner;

public class ExpertQuestionBank {
	private int score;
	
	public static int questionsExpertDM1(int score) {
		// does this work in vim?
		// this should works
		System.out.printf("CATEGORY: \n"
				+ "\n" 
				+ "A.\n" 
				+ "B.\n" 
				+ "C.\n" 
				+ "D.\n"
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("")) {
			score++;
		}
		
		return score;
	}

	public static int questionsExpertDM2(int score) {
		System.out.printf("CATEGORY: \n"
				+ "\n" 
				+ "A.\n" 
				+ "B.\n" 
				+ "C.\n" 
				+ "D.\n"
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("")) {
			score++;
		}
		
		return score;
	}

	public static int questionsExpertCOR1(int score) {
		System.out.printf("CATEGORY: \n"
				+ "\n" 
				+ "A.\n" 
				+ "B.\n" 
				+ "C.\n" 
				+ "D.\n"
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("")) {
			score++;
		}
		
		return score;
	}
	
	public static int questionsExpertCOR2(int score) {
		System.out.printf("CATEGORY: \n"
				+ "\n" 
				+ "A.\n" 
				+ "B.\n" 
				+ "C.\n" 
				+ "D.\n"
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("")) {
			score++;
		}
		
		return score;
	}
	
	public static int questionsExpertCSF1(int score) {
		System.out.printf("CATEGORY: \n"
				+ "\n" 
				+ "A.\n" 
				+ "B.\n" 
				+ "C.\n" 
				+ "D.\n"
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("")) {
			score++;
		}
		
		return score;
	}
	
	public static int questionsExpertCSF2(int score) {
		System.out.printf("CATEGORY: \n"
				+ "\n" 
				+ "A.\n" 
				+ "B.\n" 
				+ "C.\n" 
				+ "D.\n"
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("")) {
			score++;
		}
		
		return score;
	}

	public  ExpertQuestionBank(int score) {

		Random rand = new Random();
		int maximum = 5;
		System.out
				.printf("|-------------------------|\n" 
					  + "|ROUND THREE LEVEL: EXPERT|\n" 
					  + "|-------------------------|\n");
		for (int i = 1; i <= 2; i++) {
			System.out.printf("Question %d\n", i);
			int questionNumber = rand.nextInt(maximum);
			if (questionNumber == 0) {
				score = questionsExpertDM1(score);
			} else if (questionNumber == 1) {
				score = questionsExpertDM2(score);
			} else if (questionNumber == 2) {
				score = questionsExpertCSF1(score);
			} else if (questionNumber == 3) {
				score = questionsExpertCSF2(score);
			} else if (questionNumber == 4) {
				score = questionsExpertCOR1(score);
			} else if (questionNumber == 5) {
				score = questionsExpertCOR2(score);
			}
		}
		this.score=score;
		}
	
	public int RoundThreeScore() {
		return score;
	}
}
