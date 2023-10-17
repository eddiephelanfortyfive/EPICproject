package EPIC;

import java.util.Scanner;

public class MainQuiz {
	public static void main(String[] args) {
		int score = 0;
		System.out.println("Are you ready to begin?: Y/N");
		Scanner scanner = new Scanner(System.in);
		String begin = scanner.nextLine();
		begin = begin.toLowerCase();
		if (begin.equals("y")) {
		} else if (begin.equals("n")) {
			
			System.out.println("okay see you next time!");
			System.exit(0);
		} else {
			System.out.print("Invalid input");
		}
		NoviceQuestionBank Score1 = new NoviceQuestionBank(score);
		score = Score1.RoundOneScore();
		IntermediateQuestionBank Score2 = new IntermediateQuestionBank(score);
		score = Score2.RoundTwoScore();
		ExpertQuestionBank Score3 = new ExpertQuestionBank(score);
		score = Score3.RoundThreeScore();
		System.out.print(score);
	
	}

}
