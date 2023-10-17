package EPIC;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class READINGTEXT {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



