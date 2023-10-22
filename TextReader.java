package EPIC;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TextReader {
    private BufferedReader reader;

    public TextReader(String username) {
        try {
            reader = new BufferedReader(new FileReader(username));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
