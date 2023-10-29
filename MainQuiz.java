package EPIC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainQuiz {
	public static void main(String[] args) {
		
		
		int score = 0;
		/*
		 * Start quiz and get username
		 * This also checks if you've played before
		 */
		
		
		UIHelper UIHelper = new UIHelper();
		//UIHelper.clearScreen(); //USE THIS TO CLEAR SCREEN
		
		UIHelper.welcome();
		
		LoginToQuiz username = new LoginToQuiz();
		String username1 = username.LoginToQuiz();
		
		System.out.println("Are you ready to begin?: Y/N");
		
		Scanner scanner = new Scanner(System.in);
		String begin = scanner.nextLine();
		
		begin = begin.toLowerCase();
		
		// Check if begin is y, if not, exit the quiz, or else return an error
		if (begin.equals("y")) {
			
			} else if (begin.equals("n")) {
	
				System.out.println("okay see you next time!");
				System.exit(0);
				} else {
					System.out.println("Invalid input");
		}
		
		//Start questions
		// Get scores from Round 1
		NoviceQuestionBank Score1 = new NoviceQuestionBank(score);
		score = Score1.RoundOneScore();
		
		IntermediateQuestionBank Score2 = new IntermediateQuestionBank(score);
		score = Score2.RoundTwoScore();
		
		ExpertQuestionBank Score3 = new ExpertQuestionBank(score);
		score = Score3.RoundThreeScore();
		
		
		
		System.out.println("Your final score is: " + score);	
		
		// Write the scores to the text file
		TextWriter scoreWriter = new TextWriter(username1, score);
		/*
		 * Calculate statistics for your quiz and your previous quizzes
		 * compares your stats to all other quizes ever played
		 * Displays statistics
		 */
		StatsForMaths getStats = new StatsForMaths();
		
		ArrayList<Double> allPlayers = getStats.getStats();
		ArrayList<Double> currentPlayer = getStats.getPlayerStats(username1);
		ArrayList<String> comparisons = getStats.compareStats(currentPlayer, allPlayers);

		
		System.out.println("Your mean is " + currentPlayer.get(0));
		System.out.println("Your median is " + currentPlayer.get(1));
		System.out.println("Your standard deviation is " + currentPlayer.get(2));
		
		System.out.println();
		
		System.out.println("The global mean is " + allPlayers.get(0));
		System.out.println("The global median is " + allPlayers.get(1));
		System.out.println("The global standard deviation is " + allPlayers.get(2));
		
		System.out.println();

		System.out.println("Your mean is " + comparisons.get(0) + " the global mean");
		System.out.println("Your median is " + comparisons.get(1) + " the global median");
		System.out.println("Your standard deviation is " + comparisons.get(2) + " the global median");
		
		System.out.println();

		
		System.out.println("Thanks for playing, see you next time!");

		
		
		scanner.close();
	}

}
