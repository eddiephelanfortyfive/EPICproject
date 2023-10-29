package EPIC;

import java.io.*;
/*import java.io.FileWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
*/import java.util.ArrayList;
import java.util.Arrays;

public class StatsForMaths {

	public ArrayList<Double> getStats() {
		TextReader csvFileRead = new TextReader();

		// playerArray is a historical log of all quiz attempts and their scores
		
		ArrayList<String> listOfAllQuizEntries = csvFileRead.readCSVFile();
		
		ArrayList<Double> points = new ArrayList<Double>();
		
		ArrayList<Double> resultStats = new ArrayList<Double>();

		
		// Create an ArrayList of Doubles from all of the quiz entries
		for (int i = 0; i < listOfAllQuizEntries.size(); i++ ) {
			// System.out.println(listOfAllQuizEntries.get(i));
			 
			//value 0 is username, value 1 is score
             String[] values = listOfAllQuizEntries.get(i).split(",");
             
             //translates string (score) into a double (score)
             double scoreAsDouble = Double.parseDouble(values[1]);
             
            
             points.add(scoreAsDouble);
             
        // 	System.out.println(str1);
			 		 
		}
		
		//System.out.println("points" + points.toArray());
		
		// This a new Java 8 way of getting an Array of Doubles from an ArrayList
		double[] pointsArray = points.stream().mapToDouble(Double::doubleValue).toArray();

	    /*
	     *  ----- Get Mean of pointsArray -----
	     * 
	     */
        double sum = 0;
        
        for (int i = 0; i < pointsArray.length; i++) {
            sum += pointsArray[i];
        }
 
        Double meanResult =  sum / (double)pointsArray.length;
       
        resultStats.add(0, meanResult);
        
        /*
         *  ------ Get Median of pointsArray ------
         * 
         */
  
        // this automatically sorts the array from smallest to biggest value
        Arrays.sort(pointsArray);
        int length = pointsArray.length;
        
        //checks if the array is odd
	        if (pointsArray.length % 2 != 0) {
	        	resultStats.add(1, (double)pointsArray[length / 2]);

	        }
	        else {		
	        	//if the array is even, it gets the mean of the 2 middle values
	        	resultStats.add(1,(double)(pointsArray[(length - 1) / 2] + pointsArray[length / 2]) / 2.0);
	        }
	    
	    /*
	     *  ------ Get Standard Deviation of pointsArray ------
	     * 
	     */
        double standardDeviation = 0.0;
        double square = 0.0;
        double standardResult = 0.0;
        
        
        for (int i = 0; i < length; i++) {
        // calculates the sum of squared deviations from the mean
        	standardDeviation  = standardDeviation + Math.pow((pointsArray[i] - meanResult), 2);
        }
        
        //get variance
        square = standardDeviation / length;
        
        //standard deviation is got by square rooting the variance
        standardResult = Math.sqrt(square);
        
        resultStats.add(2, standardResult);
	        
	   return resultStats;     
	        
		}				
	
	public ArrayList<Double> getPlayerStats(String username) {

		TextReader csvFileRead = new TextReader();
	
		// playerArray is a historical log of all quiz attempts and their scores
		
		ArrayList<String> listOfAllQuizEntries = csvFileRead.readCSVFile();
		
		ArrayList<Double> points = new ArrayList<Double>();
		
		ArrayList<Double> resultStats = new ArrayList<Double>();
	
		
		// Create an ArrayList of Doubles from all of the quiz entries
		for (int i = 0; i < listOfAllQuizEntries.size(); i++ ) {
			// System.out.println(listOfAllQuizEntries.get(i));
			 
			//value 0 is username, value 1 is score
	         String[] values = listOfAllQuizEntries.get(i).split(",");
	         
	         //translates string (score) into a double (score)
	         double scoreAsDouble = Double.parseDouble(values[1]);
	         //the if statement only collects quiz entries for this particular username
	         if (username.equals(values[0])) {
	        	 points.add(scoreAsDouble);
	         
	         } 			 		 
		}
		
		//System.out.println("points" + points.toArray());
		
		// This a new Java 8 way of getting an Array of Doubles from an ArrayList
		double[] pointsArray = points.stream().mapToDouble(Double::doubleValue).toArray();
	
		System.out.println(Arrays.toString(pointsArray));
	    /*
	     *  ----- Get Mean of pointsArray -----
	     * 
	     */
	    double sum = 0;
	    
	    for (int i = 0; i < pointsArray.length; i++) {
	        sum += pointsArray[i];
	    }
	
	    Double meanResult =  sum / (double)pointsArray.length;
	   
	    resultStats.add(0,meanResult);
	    
	    /*
	     *  ------ Get Median of pointsArray ------
	     * 
	     */
	
	    // this automatically sorts the array from smallest to biggest value
	    Arrays.sort(pointsArray);
	    int length = pointsArray.length;
	    
	    //checks if the array is odd
	        if (pointsArray.length % 2 != 0) {
	        	resultStats.add(1,(double)pointsArray[length / 2]);
	
	        }
	        else {		
	        	//if the array is even, it gets the mean of the 2 middle values
	        	resultStats.add(1,(double)(pointsArray[(length - 1) / 2] + pointsArray[length / 2]) / 2.0);
	        }
	    
	    /*
	     *  ------ Get Standard Deviation of pointsArray ------
	     * 
	     */
	    double standardDeviation = 0.0;
	    double square = 0.0;
	    double standardResult = 0.0;
	    
	    
	    for (int i = 0; i < length; i++) {
	    // calculates the sum of squared deviations from the mean
	    	standardDeviation  = standardDeviation + Math.pow((pointsArray[i] - meanResult), 2);
	    }
	    
	    //get variance
	    square = standardDeviation / length;
	    
	    //standard deviation is got by square rooting the variance
	    standardResult = Math.sqrt(square);
	    
	    resultStats.add(2,  + standardResult);
	        
	   return resultStats;     
	        
		}		
	
	public ArrayList<String> compareStats(ArrayList<Double> playerStats, ArrayList<Double> allStats) {

		
		ArrayList<String> comparison = new ArrayList<String>();
	
		double currentPlayerMean = playerStats.get(0);
		double currentPlayerMedian = playerStats.get(1);
		double currentPlayerStandardDev = playerStats.get(2);
		
		double globalMean = allStats.get(0);
		double globalMedian = allStats.get(1);
		double globalStandardDev = allStats.get(2);
		
		
		if (currentPlayerMean > globalMean) {
			
				comparison.add(0, "greater than");
			} else {
				comparison.add(0, "less than");
			}
		
		
		if (currentPlayerMedian > globalMedian) {
			
				comparison.add(1, "greater than");
			} else {
				comparison.add(1, "less than");
			}
		
		if (currentPlayerStandardDev > globalStandardDev) {
				
				comparison.add(2, "greater than");
			} else {
				comparison.add(2, "less than");
			}
		
		return comparison;
		
		
		}
	
	}