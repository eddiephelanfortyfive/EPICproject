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
		for (int i=0; i<1; i++) {
			Scanner answer = new Scanner(System.in);
			String input = answer.nextLine();
			input = input.toLowerCase();
			if(input.equals("a")||input.equals("b")||input.equals("c")||input.equals("d")) {
			if (input.equals("a")) {
				score++;
			}
			}else {System.out.printf("Invalid input please try again.\n"
					+ "Enter answer:\n");
			i--;}
			}
		
		return score;
	}

	public static int questionsIntermediateDM2(int score) {
		System.out.printf("CATEGORY: Discrete Mathmatics\n"
				+ "In a Knights and Knaves scenario. A and B. A says, \"A says \"We are the same kind.\"\" B says \"We are different kinds.\"\n"
				+ "Based on A and B's statements, What can you conclude about A and B?\n"
				+ "\n" 
				+ "A. A is a Knight, and B is a Knight.\n"
				+ "B. A is a Knight, and B is a Knave.\n" 
				+ "C. A is a Knave, and B is a Knave.\n" 
				+ "D. A is a Knave, and B is a Knight.\n"
				+ "Enter answer:\n");
		for (int i=0; i<1; i++) {
			Scanner answer = new Scanner(System.in);
			String input = answer.nextLine();
			input = input.toLowerCase();
			if(input.equals("a")||input.equals("b")||input.equals("c")||input.equals("d")) {
			if (input.equals("d")) {
				score++;
			}
			}else {System.out.printf("Invalid input please try again.\n"
					+ "Enter answer:\n");
			i--;}
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
		for (int i=0; i<1; i++) {
			Scanner answer = new Scanner(System.in);
			String input = answer.nextLine();
			input = input.toLowerCase();
			if(input.equals("a")||input.equals("b")||input.equals("c")||input.equals("d")) {
			if (input.equals("b")) {
				score++;
			}
			}else {System.out.printf("Invalid input please try again.\n"
					+ "Enter answer:\n");
			i--;}
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
		for (int i=0; i<1; i++) {
			Scanner answer = new Scanner(System.in);
			String input = answer.nextLine();
			input = input.toLowerCase();
			if(input.equals("a")||input.equals("b")||input.equals("c")||input.equals("d")) {
			if (input.equals("a")) {
				score++;
			}
			}else {System.out.printf("Invalid input please try again.\n"
					+ "Enter answer:\n");
			i--;}
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
		for (int i=0; i<1; i++) {
			Scanner answer = new Scanner(System.in);
			String input = answer.nextLine();
			input = input.toLowerCase();
			if(input.equals("a")||input.equals("b")||input.equals("c")||input.equals("d")) {
			if (input.equals("b")) {
				score++;
			}
			}else {System.out.printf("Invalid input please try again.\n"
					+ "Enter answer:\n");
			i--;}
			}
		return score;
	}

	public static int questionsIntermediateCOR2(int score) {

		System.out.printf("CATEGORY: Computer Organisation \n"
				+ "What is the purpose of the Arithmetic Logic Unit (ALU) in a CPU?\n"
				+ "\n" 
				+ "A. To perform arithmetic and logical operations\n" 
				+ "B. To store program instructions\n" 
				+ "C. To manage memory allocation\n" 
				+ "D. To control input/output devices\n"
				+ "Enter answer:\n");
		for (int i=0; i<1; i++) {
			Scanner answer = new Scanner(System.in);
			String input = answer.nextLine();
			input = input.toLowerCase();
			if(input.equals("a")||input.equals("b")||input.equals("c")||input.equals("d")) {
			if (input.equals("a")) {
				score++;
			}
			}else {System.out.printf("Invalid input please try again.\n"
					+ "Enter answer:\n");
			i--;}
			}
		return score;
	}

	public IntermediateQuestionBank(int score) {

		Random rand = new Random();
		int count0=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int maximum = 5;
		System.out.printf("|-----------------------------|\n" 
						+ "|ROUND TWO LEVEL: INTERMEDIATE|\n"
						+ "|-----------------------------|\n");
		for (int i = 1; i <= 2; i++) {
			System.out.printf("Question %d\n", i);
			int questionNumber = rand.nextInt(maximum);
			if (questionNumber == 0&&count0==0) {
				count0++;
				score = questionsIntermediateDM1(score);
			} else if (questionNumber == 1&&count1==0) {
				count1++;
				score = questionsIntermediateDM2(score);
			} else if (questionNumber == 2&&count2==0) {
				count2++;
				score = questionsIntermediateCSF1(score);
			} else if (questionNumber == 3&&count3==0) {
				count3++;
				score = questionsIntermediateCSF2(score);
			} else if (questionNumber == 4&&count4==0) {
				count4++;
				score = questionsIntermediateCOR1(score);
			} else if (questionNumber == 5&&count5==0) {
				count5++;
				score = questionsIntermediateCOR2(score);
			}else {i--;}
		}
		
		this.score=score;
	}	

	public int RoundTwoScore() {
		return score;
	}
}
