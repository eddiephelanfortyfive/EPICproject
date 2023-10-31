package EPIC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainQuiz {
	public static void main(String[] args) {
		int score = 0;	//initializing the variable score which counts how many questions the player answered correctly
		
		 /* Start quiz and get user-name
		 * This also checks if you've played before
		 */
		UIHelper UIHelper = new UIHelper();
		UIHelper.welcome();	
		/*This class prints out Header for the quiz*/
		
		LoginToQuiz username = new LoginToQuiz();
		String username1 = username.LoginToQuiz();
		/*Calling the login class and initializing the variable username1 and assigning it
		 * to the output of the method user-name in the class logintoquiz*/
		
		
		System.out.println("Are you ready to begin?: Y/N");
		/*asking the player if they would like to begin the game*/
		
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
					System.exit(0);
		}
		
		//Start questions
		// Get scores from Round 1
		//comments contained in NoviceQuestionBank apply to all question banks.
		NoviceQuestionBank Score1 = new NoviceQuestionBank(score);
		score = Score1.RoundOneScore();
		// Get scores from Round 3
		IntermediateQuestionBank Score2 = new IntermediateQuestionBank(score);
		score = Score2.RoundTwoScore();
		// Get scores from Round 3
		ExpertQuestionBank Score3 = new ExpertQuestionBank(score);
		score = Score3.RoundThreeScore();
		
		System.out.println("Your final score is: " + score);
		System.out.print("Your score history:");//printing users score	
		
		// Write the scores to the c.s.v. file
		TextWriter scoreWriter = new TextWriter(username1, score);
		/*
		 * Calculate statistics for your quiz and your previous quizzes
		 * compares your stat's to all other quiz's ever played
		 * Displays statistics
		 */
		StatsForMaths getStats = new StatsForMaths();
		
		ArrayList<Double> allPlayers = getStats.getStats();
		ArrayList<Double> currentPlayer = getStats.getPlayerStats(username1);
		ArrayList<String> comparisons = getStats.compareStats(currentPlayer, allPlayers);

		//This prints the statistics 
		System.out.printf(""
				+ "---------------------------------\n"
				+ "Your mean is %.2f\n" 
				+ "Your median is %.2f\n" 
				+ "Your standard deviation is %.2f\n"
				+ "---------------------------------\n"
				+ "\n"
				+ "---------------------------------------\n" 
                + "The global mean is %.2f\n" 
                + "The global median is %.2f\n" 
                + "The global standard deviation is %.2f\n"
                + "---------------------------------------\n"
                + "\n"
                + "----------------------------------------------------------------------\n" 
                + "Your mean is %s the global mean.\n" 
                + "Your median is %s the global median.\n" 
                + "Your standard deviation is %s the global standard deviation.\n"
                + "----------------------------------------------------------------------\n"
                + "\n"
                + "========================================\n" 
                + "Thanks for playing! See you next time!!!\n"
                + "========================================\n",
                currentPlayer.get(0), currentPlayer.get(1), currentPlayer.get(2),
                allPlayers.get(0), allPlayers.get(1), allPlayers.get(2),
                comparisons.get(0), comparisons.get(1), comparisons.get(2));

		
		scanner.close();
	}

}
