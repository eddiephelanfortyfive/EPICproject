package EPIC;
import java.io.File;
//import java.io.FileWriter;
//import java.io.FileReader;
//import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class LoginToQuiz {
	private String username;
    public LoginToQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();
        File pastUsersFile = new File(username + ".txt");
        
        try {
            if (!pastUsersFile.exists()) {
                pastUsersFile.createNewFile();
                System.out.printf("Welcome %s you have created a new account.\n",username);
            }
            if (pastUsersFile.exists()) {System.out.printf("Welcome Bask %s you have logged in.\n",username);}
           
        } catch (IOException e) {
            e.printStackTrace(); 
        }
      this.username=username;
        
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

        
    

