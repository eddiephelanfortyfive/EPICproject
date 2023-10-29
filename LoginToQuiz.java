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
        
        /*
        File pastUsersFile = new File(username + ".txt");
        File usernameHolder = new File("UserNameHolder.txt");
        */
        
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
        	
        	/*
        	// Looping over the HashMap with the keys (which are usernames) to see if the username has been seen before, if not, add to ArrayList which holds distinct usernames
        	for (String i : playerArray.keySet()) {
        		  System.out.println("key: " + i + " value: " + playerArray.get(i));
    			  playerNames.add(i);
        		  
        		}
        		*/
        	
     
        	if (playerNames.contains(username)) {
            	System.out.printf("Welcome Back %s you have logged in.\n",username);
        	}
    			else {
                    System.out.printf("Welcome %s you have created a new account.\n",username);
    			}
        	
            // Add the username to PlayerNames array
            playerNames.add(username);


        	 /* if (!usernameHolder.exists()) {
        		
        		usernameHolder.createNewFile();
        		
        		}
        	
          if (!pastUsersFile.exists()) {
            	
                pastUsersFile.createNewFile();
                
    			FileWriter writer = new FileWriter("UserNameHolder.txt", true);
    			writer.write( username+".txt" + "\n");
    			writer.close();
    			
                System.out.printf("Welcome %s you have created a new account.\n",username);
            }
            else if (pastUsersFile.exists()) {
            	System.out.printf("Welcome Back %s you have logged in.\n",username);
            	} */
        	
     //   	scanner.close();
           
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        
        this.username=username;
        
        return username;
    }
    
}

/*try {
FileWriter writer = new FileWriter(pastUsersFile, true); 
writer.write(score + "\n");
writer.close();
} catch (IOException e) {
e.printStackTrace();
} 
try {
	 reader = new BufferedReader(new FileReader(pastUsersFile));
   
   String line;
   while ((line = reader.readLine()) != null) {
       System.out.println(line); 
   }
   
   
   reader.close();
} catch (IOException e) {
   e.printStackTrace(); 
}*/

        
    

