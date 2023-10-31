package EPIC;
import java.io.File;
import java.io.FileWriter;
//import java.io.FileWriter;
//import java.io.FileReader;
//import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LoginToQuiz {
	
	private String username;
	
    public String LoginToQuiz() {
    	
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the player to enter name
        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();
       
        
        File resultsFile = new File("results.csv");
                
		TextReader scoreReaderTest = new TextReader();

		// HashMap is an Array of Arrays
		//HashMap<String, String> playerArray = scoreReaderTest.readCSVFile();
		
		// playerArray is a historical log of all quiz attempts and their scores
		ArrayList<String> playerArray = scoreReaderTest.readCSVFile();

		
		// ArrayList is an array, that's more flexible, you can add stuff to it, which you can't do in a normal array like String[]
		ArrayList<String> playerNames = new ArrayList<String>();
		
        try { 
        	
        	
        	// If there is no CSV file, create one
        	if (!resultsFile.exists()) {
        		
        		resultsFile.createNewFile();
        		
        		}
        	
            for (int i = 0; i < playerArray.size(); i++) {
                //System.out.println(playerArray.get(i));
                
	             String[] values = playerArray.get(i).split(",");
	             
	             playerNames.add(values[0]);

              }
        	
     
        	if (playerNames.contains(username)) {
            	System.out.printf("Welcome Back %s you have logged in.\n",username);
        	}
    			else {
                    System.out.printf("Welcome %s you have created a new account.\n",username);
    			}
        	
            // Add the username to PlayerNames array
            playerNames.add(username);


           
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        
        this.username=username;
        
        return username;
    }
    
}


        
    

