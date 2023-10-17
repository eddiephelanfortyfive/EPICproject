package EPIC;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TEXTFile {
	

	    public static void main(String[] args) {
	        String data = "Hello, this is some data to be written to a file.";
	        
	        try (FileWriter writer = new FileWriter("data.txt");
	             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
	            bufferedWriter.write(data);
	            System.out.println("Data has been written to the file.");
	        } catch (IOException e) {
	         e.printStackTrace();
	        }
}
}
