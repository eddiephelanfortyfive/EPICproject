package EPIC;

import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {
	public TextWriter(String username, int score) {
		String username1 = username;
		try {
			FileWriter writer = new FileWriter(username1, true);
			writer.write(score + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
