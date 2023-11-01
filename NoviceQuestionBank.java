package EPIC;

import java.util.Random;
import java.util.Scanner;

public class NoviceQuestionBank {
	private int score;
	/*each method contains a question that is printed to the screen.
	 then the user is prompted to choose one of the four possible answers.
	 user input's the answer they believe to be correct.
	 if user inputs a letter that is not A,B,C or D they will get a error message
	 and the user will be asked to answer again this will repeat until the user enters a valid input
	 if user answers the question correctly the variable score is increased by 1.
	 */
	
	public static int questionsNoviceDM1(int score) {

		System.out.printf("CATEGORY: Descrete Mathmatics\n"
				+ "	Which of the following represents the intersection of two sets A and B\n" 
				+ "\n"
				+ "A. A - B\n"
				+ "B. A ∪ B\n"
				+ "C. A ∩ B\n"
				+ "D. A × B\n" 
				+ "Enter answer:\n");
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

	public static int questionsNoviceDM2(int score) {
		System.out.printf("CATEGORY: Descrete Mathmatics\n"
				+ "	What is the result of the following expression?\n"
				+ "(A AND B) OR (NOT C)\n"
				+ "\n" 
				+ "A. True if A and B are both true, regardless of C. \n"
				+ "B. True if either A and B are true or C is false.\n"
				+ "C. True if A and B are both true and C is false. \n"
				+ "D. True if A is true, B is false, and C is true.\n"
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

	public static int questionsNoviceCSF1(int score) {
		System.out.printf("CATEGORY: Computer Science Foundation\n"
				+ "Which one of these statments relates to ¬(A∨B):\n"
				+"\n"
				+ "A. A AND B\n" 
				+ "B. A OR B\n"
				+ "C. The negation of A AND B\n"
				+ "D. The negation of A OR B\n"
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

	public static int questionsNoviceCSF2(int score) {
		System.out.printf("CATEGORY: Computer Science Foundation\n"
				+ "Which of the following is a universal set containing all the elements in a specific context?	\n"
				+ "\n" 
				+ "A. Power set \n" 
				+ "B. Subset \n" 
				+ "C. Conplament set \n" 
				+ "D. Sample space \n"
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

	public static int questionsNoviceCOR1(int score) {
		System.out.printf("CATEGORY: Computer Organisation\n" 
				+ "	What is the primary function of an operating system?\n"		
				+ "\n" 
				+ "A. Running applications \n"
				+ "B. Storing data \n"	
				+ "C. Managing hardware and resources \n" 
				+ "D. Creating Websites \n"
				+ "Enter answer:\n");
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

	public static int questionsNoviceCOR2(int score) {
		System.out.printf("CATEGORY: Computer Organisation\n"
				+ "	What is the term for a high-level programming language that is easy to read and write, often used for teaching programming concepts?\n"
				+ "\n" 
				+ "A. Assembly language\n" 
				+ "B. Machine code\n"
				+ "C. Python\n" 
				+ "D. Binary code\n"
				+ "Enter answer:\n");
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

	public NoviceQuestionBank(int score) {
		/*This method chooses the questions at random.
		 * the count variables initialized below are to make sure a question is not chosen twice
		 * if a question is chosen it's count is increased by one. Now this question cannot be chosen as it does not meet 
		 * the requirements made in the if statement.
		 * no question is chosen and the else is activated which reduces the variable i by 1 causing the loop to execute again
		 * this continues until 2 unique questions are chosen*/

		Random rand = new Random();
		int count0=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int maximum = 5;
		System.out
				.printf("|-----------------------|\n" 
						+ "|ROUND ONE LEVEL: NOVICE|\n" 
						+ "|-----------------------|\n");
		for (int i = 1; i <= 2; i++) {
			System.out.printf("Question %d\n", i);
			int questionNumber = rand.nextInt(maximum);
			if (questionNumber == 0&&count0==0) {
				count0++;
				score = questionsNoviceDM1(score);
			} else if (questionNumber == 1&&count1==0) {
				count1++;
				score = questionsNoviceDM2(score);
			} else if (questionNumber == 2&&count2==0) {
				count2++;
				score = questionsNoviceCSF1(score);
			} else if (questionNumber == 3&&count3==0) {
				count3++;
				score = questionsNoviceCSF2(score);
			} else if (questionNumber == 4&&count4==0) {
				count4++;
				score = questionsNoviceCOR1(score);
			} else if (questionNumber == 5&&count5==0) {
				count5++;
				score = questionsNoviceCOR2(score);
			}else {i--;}
			
		}
		this.score=score;
		}
	
	public int RoundOneScore() {
	        return score;
	    }

}
