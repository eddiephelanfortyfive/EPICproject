package EPIC;

import java.util.Random;
import java.util.Scanner;

public class Quizlogic {
	public static void main(String[] args) {
		int score = 0;
		System.out.println("Are you ready to begin?: Y/N");
		Scanner scanner = new Scanner(System.in);
		String begin = scanner.nextLine();
		begin = begin.toLowerCase();
		if (begin.equals("y")) {
		} else if (begin.equals("n")) {
		} else {
			System.out.print("Invalid input");
		}
		score = noviceQuestions(score);
		System.out.print(score);

	}

	public static int noviceQuestions(int score) {
		Random rand = new Random();
		int maximum = 5;
		System.out.printf("|-----------------------|\n"
				        + "|ROUND ONE LEVEL: NOVICE|\n"
				        + "|-----------------------|\n");
		for (int i = 1; i <= 2; i++) {
			System.out.printf("Question %d\n",i);
			int questionNumber = rand.nextInt(maximum);
			if (questionNumber == 0) {
				score =  questionsNoviceDM1(score);
			} else if (questionNumber == 1) {
				score = questionsNoviceMD2(score);
			} else if (questionNumber == 2) {
				score =questionsNoviceCSF1(score);
			} else if (questionNumber == 3) {
				score = questionsNoviceCSF2(score);
			} else if (questionNumber == 4) {
				score = questionsNoviceCOR1(score);
			} else if (questionNumber == 5) {
				score = questionsNoviceCOR2(score);
			}
		}
		return score;

	}

	public static int questionsNoviceDM1(int score) {

		System.out.printf("CATEGORY: Descrete Mathmatics\n"
				+ "	Which of the following represents the intersection of two sets A and B\n" + "\n" 
				+ "A. A - B\n"
				+ "B. A ∪ B\n" 
				+ "C. A ∩ B\n" 
				+ "D. A × B\n" 
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("c")) {
			score++;
		}
		return score;
	}

	public static int questionsNoviceMD2(int score) {
		System.out.printf("CATEGORY: Descrete Mathmatics\n"
				+ "	What is the result of the following expression?\n" 
				+ "(A AND B) OR (NOT C)\n"
				+ "A. True if A and B are both true, regardless of C. \n"
				+ "B. True if either A and B are true or C is false.\n" 
				+ "C. True if A and B are both true and C is false. \n" 
				+ "D. True if A is true, B is false, and C is true.\n" 
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("a")) {
			score++;
		}
		return score;
	}

	public static int questionsNoviceCSF1(int score) {
		System.out.printf("CATEGORY: Computer Science Foundation\n"
				  + "Which one of these statments relates to ¬(A∨B):\n"
		          + "A: A AND B\n"
		          + "B: A OR B\n"
		          + "C: The negation of A AND B\n"
		          + "D: The negation of A OR B\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("d")) {
			score++;
		}
		return score;
	}

	public static int questionsNoviceCSF2(int score) {
		System.out.printf("CATEGORY: Computer Science Foundation\n"
				+ "	\n" + "\n" 
				+ "A. \n"
				+ "B. \n" 
				+ "C. \n" 
				+ "D. \n" 
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("")) {
			score++;
		}
		return score;
	}

	public static int questionsNoviceCOR1(int score) {
		System.out.printf("CATEGORY: Computer Organisation\n"
				+ "	What is the primary function of an operating system?\n" + "\n" 
				+ "A. Running applications \n"
				+ "B. Storing data \n" 
				+ "C. Managing hardware and resources \n" 
				+ "D. Creating Websites \n" 
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("c")) {
			score++;
		}
		return score;
	}

	public static int questionsNoviceCOR2(int score) {
		System.out.printf("CATEGORY: Computer Organisation\n"
				+ "	What is the term for a high-level programming language that is easy to read and write, often used for teaching programming concepts?\n" + "\n" 
				+ "A. Assembly language\n"
				+ "B. Machine code\n" 
				+ "C. Python\n" 
				+ "D. Binary code\n" 
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("c")) {
			score++;
		}
		return score;

	}
}
