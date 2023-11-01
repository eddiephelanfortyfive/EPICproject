package EPIC;

import java.util.Random;
import java.util.Scanner;

public class ExpertQuestionBank {
	private int score;
	
	public static int questionsExpertDM1(int score) {
		
		System.out.printf("CATEGORY: Discrete Maths\n"
				+"Which of the following is a property of an equivalence relation in set theory?\n"
				+ "\n"
				+"A. Reflexivity\n"
				+"B. Injectivity\n"
				+"C. Linearity\n"
				+"D. Partiality\n"
				+"Enter answer:\n");
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

	public static int questionsExpertDM2(int score) {
		System.out.printf("CATEGORY: \n"
				+" In set theory, what is the cardinality of the power set of a set with n elements?\n"
				+ "\n"
				+"A. n\n"
				+"B. 2^n\n"
				+"C. 2n\n"
				+"D. n!\n"
				+"Enter answer:\n");
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

	public static int questionsExpertCOR1(int score) {
		System.out.printf("CATEGORY: Computer Organisation\n"
				+"What is the purpose of a cache memory hierarchy in a computer system?\n"
				+ "\n"
				+"A. To increase the overall memory capacity of the system\n"
				+"B. To reduce the latency in memory access\n"
				+"C. To provide permanent storage for the operating system\n"
				+"D. To enhance the clock speed of the CPU);"
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
	
	public static int questionsExpertCOR2(int score) {
		System.out.printf("CATEGORY: Computer Organisation\n"
				+"Which of these best describes the Von Neumann bottleneck:\n"
				+ "\n"
				+ "A. Is the limited speed of data transfer between the CPU and RAM, causing the CPU to wait for data from memory.\n"
				+ "B. Is a hardware flaw that affects the CPU's ability to execute complex instructions.\n"
				+ "C. Is a software limitation that restricts the types of programs that can run on a computer.\n"
				+ "D. Is a security vulnerability that allows unauthorized access to a computer's memory.\n"
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
	
	public static int questionsExpertCSF1(int score) {
		System.out.printf("CATEGORY:Computer Science Foundations \n"
				+"In computer science, what is the purpose of an \"API\" (Application Programming Interface), and why is it a crucial concept in software development?\n"
				+ "\n"
				+ "A. An API is a type of software testing tool, and it is crucial for identifying and fixing software bugs.\n"
				+ "B. An API is a user interface for operating systems, and it is crucial for designing graphical user interfaces (GUIs).\n"
				+ "C. An API is a set of rules and protocols that allow different software applications to communicate and interact, and it is crucial for enabling software components to work together efficiently.\n"
				+ "D. An API is a type of programming language, and it is crucial for creating new operating systems.\n"
				+ "Enter answer: ");

		for (int i=0; i<1; i++) {
			Scanner answer = new Scanner(System.in);
			String input = answer.nextLine();
			input = input.toLowerCase();
			if(input.equals("a")||input.equals("b")||input.equals("c")||input.equals("d")) {
			if (input.equals("c")) {
				score++;
			}
			}else {System.out.printf("Invalid input please try again.\n"
					+ "Enter answer:\n");
			i--;}
			}
		return score;
	}
	
	public static int questionsExpertCSF2(int score) {
		System.out.printf("CATEGORY: Computer Science Foundations \n"
				+ "In a bounded lattice, which of the following statements is true?\n"
				+ "\n"
				+ "A. There is a unique greatest element and a unique least element.\n"
				+ "B. There is no greatest element, but there is a unique least element.\n"
				+ "C. There is a unique greatest element, but there is no least element.\n"
				+ "D. There is no greatest element and no least element.\n"
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

	public  ExpertQuestionBank(int score) {

		Random rand = new Random();
		int count0=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int maximum = 5;
		System.out
				.printf("|-------------------------|\n" 
					  + "|ROUND THREE LEVEL: EXPERT|\n" 
					  + "|-------------------------|\n");
		for (int i = 1; i <= 2; i++) {
			System.out.printf("Question %d\n", i);
			int questionNumber = rand.nextInt(maximum);
			if (questionNumber == 0&&count0==0) {
				count0++;
				score = questionsExpertDM1(score);
			} else if (questionNumber == 1&&count1==0) {
				count1++;
				score = questionsExpertDM2(score);
			} else if (questionNumber == 2&&count2==0) {
				count2++;
				score = questionsExpertCSF1(score);
			} else if (questionNumber == 3&&count3==0) {
				count3++;
				score = questionsExpertCSF2(score);
			} else if (questionNumber == 4&&count4==0) {
				count4++;
				score = questionsExpertCOR1(score);
			} else if (questionNumber == 5&&count5==0) {
				count5++;
				score = questionsExpertCOR2(score);
			}else {i--;}
		}
		this.score=score;
		}
	
	public int RoundThreeScore() {
		return score;
	}
}
