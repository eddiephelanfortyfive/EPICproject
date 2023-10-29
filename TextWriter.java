package EPIC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {
	
    private BufferedWriter writer;

    
	public TextWriter(String username, int score) {
		
		String username1 = username;
				
		try {
			
		// you need to add true here or else FileWriter will overwrite everything in the file, true allows it to append to the end of the file
   	     writer = new BufferedWriter(new FileWriter("results.csv", true));


         // Write data to the CSV file
         
         // We have to store the data as a String, so convert the Integer to a String
      
         String[] data = {username, Integer.toString(score)};
         String dataLine = String.join(",", data);
         writer.write(dataLine);
         writer.newLine();

         // Close the BufferedWriter
         writer.close();

    //     System.out.println("CSV file created successfully.");
		
		}
		catch (IOException e) {
			e.printStackTrace();
		} 
		
		/*
		try {
			FileWriter writer = new FileWriter(username1, true);
			writer.write(score + "\n");
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} */

	}

}
