package EPIC;

import java.util.Random;
import java.util.Scanner;

public class IntermediateQuestionBank {
	private int score;
	
	public static int questionsIntermediateDM1(int score) {
		System.out.printf("CATEGORY: Discrete Mathmatics \n"
				+ "What are the domain and codomain of a function?\n"
				+ "\n" 
				+ "A. The domain is the set of all possible inputs, and the codomain is the set of all possible outputs\n" 
				+ "B. The domain is the set of all possible outputs, and the codomain is the set of all possible inputs\n" 
				+ "C. The domain is the set of all possible inputs, and the codomain is a single output value\n" 
				+ "D. The domain and codomain of a function are the same set\n"
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("a")) {
			score++;
		}
		
		return score;
	}

	public static int questionsIntermediateDM2(int score) {
		System.out.printf("CATEGORY: Discrete Mathmatics\n"
				+ "In a Knights and Knaves scenario. A and B. A says, \"B is a Knight.\" A says nothing.\n"
				+ "\n" 
				+ "A. Based on A's statement, which of the following conclusions can you draw about B?\n" 
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
	
	public static int questionsIntermediateCSF1(int score) {
		System.out.printf("CATEGORY: Computer Science\n"
				+ "What does the term \"object-oriented programming\" (OOP) refer to in computer science? \n"
				+ "\n" 
				+ "A. A coding style that focuses on optimizing program execution speed\n" 
				+ "B. A programming paradigm that uses objects to model real-world entities and their interactions\n" 
				+ "C. A method for designing computer hardware\n" 
				+ "D. A language used for low-level system programming\n"
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("b")) {
			score++;
		}
		return score;
	}

	public static int questionsIntermediateCSF2(int score) {
		System.out.printf("CATEGORY: Computer Science\n"
				+ "Which one of these represents De Morgan's law:\n"
				+ "\n" 
				+ "A. ¬(X ∧ Y) ≡ (¬X ∨ ¬Y)\n" 
				+ "B. ¬(X ∧ Y) ≡ (¬X ≡ ¬Y)\n" 
				+ "C. (X ∧ Y) ∨ (X ∨ Y)\n" 
				+ "D. ¬(X ∧ Y) ≡ ¬(¬X ∨ ¬Y)\n"
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("a")) {
			score++;
		}
		return score;
	}

	public static int questionsIntermediateCOR1(int score) {
		System.out.printf("CATEGORY: Computer Organisation \n"
				+ "What is the function of a level 0 in a multilevel machine?	\n"
				+ "\n" 
				+ "A. Implements interpreters and translators\n" 
				+ "B. Binary inputs used to create memory or execute instructions\n" 
				+ "C. Fetch, Decode, Execute cycle\n" 
				+ "D. Provides power to the computer\n"
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("b")) {
			score++;
		}
		return score;
	}

	public static int questionsIntermediateCOR2(int score) {

		System.out.printf("CATEGORY: Computer Organisation \n"
				+ "	\n"
				+ "What is the purpose of the Arithmetic Logic Unit (ALU) in a CPU?\n" 
				+ "A. To perform arithmetic and logical operations\n" 
				+ "B. To store program instructions\n" 
				+ "C. To manage memory allocation\n" 
				+ "D. To control input/output devices\n"
				+ "Enter answer:\n");
		Scanner answer = new Scanner(System.in);
		String input = answer.nextLine();
		input = input.toLowerCase();
		if (input.equals("a")) {
			score++;
		}
		return score;
	}

	public IntermediateQuestionBank(int score) {

		Random rand = new Random();
		int maximum = 5;
		System.out.printf("|-----------------------------|\n" + "|ROUND TWO LEVEL: INTERMEDIATE|\n"
				+ "|-----------------------------|\n");
		for (int i = 1; i <= 2; i++) {
			System.out.printf("Question %d\n", i);
			int questionNumber = rand.nextInt(maximum);
			if (questionNumber == 0) {
				score = questionsIntermediateDM1(score);
			} else if (questionNumber == 1) {
				score = questionsIntermediateDM2(score);
			} else if (questionNumber == 2) {
				score = questionsIntermediateCSF1(score);
			} else if (questionNumber == 3) {
				score = questionsIntermediateCSF2(score);
			} else if (questionNumber == 4) {
				score = questionsIntermediateCOR1(score);
			} else if (questionNumber == 5) {
				score = questionsIntermediateCOR2(score);
			}
		}
		this.score=score;
	}	

	public int RoundTwoScore() {
		return score;
	}
}
