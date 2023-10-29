package EPIC;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class TextReader {
	
    private BufferedReader reader;

    public ArrayList<String> readCSVFile() {
    	
        //<String, String> playerHistory = new HashMap<String, String>();
        ArrayList<String> playerHistory = new ArrayList<String>();

    	
    	 try {
	
    	     reader = new BufferedReader(new FileReader("results.csv"));

             String line;
    	 
             while ((line = reader.readLine()) != null) {
    	
                 
	             String[] values = line.split(",");
	          //   System.out.println(" This is my username: " + values[0] + " and this is my score " + values[1]);
	            // playerHistory.put(values[0], values[1]);
	             playerHistory.add(values[0]+ ","  + values[1]);
	             
             }

             reader.close();
             
     /*   try {
            reader = new BufferedReader(new FileReader(username));

           
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
           */ 
        } catch (IOException e) {
            e.printStackTrace();
        	}
    	return playerHistory;
    }


}
