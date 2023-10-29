package EPIC;


public class UIHelper {

public void welcome() {
	
	String welcome = """
            
            
            
            ---------: .-                       ----: :--   .:----:.   --------. ----:              
                ==     :+                      .++:.. =+=  -++:..:++-  ++-:::::. ..=+-              
                ==     :+:--==:   :=--=-       .++.   =+=  =+=:.       ++:         =+-              
                ==     :+.   :+. -=    -+      .++.   =+=   -=++++=-   ++++++++    =+-              
                ==     :+     +. +=------      .++.   =+=       .:=++  ++-         =+-              
                ==     :+     +. -=    .:      .++.   =+=  =+=....=+=  ++-.....    =+-              
                --     :=     =.  :-----.      .++.   -=-   :-====-:   ========.   =+-              
                                               .++--:                            --=+-              
                                                .....                            .....              
                                                                                                    
                                                                                                    
        .:----:                                              .-.                                    
       ==.    :+-                                            .+:                                    
      ==        .   -=--=:  .=:--=-.---=:   :=--=:   :=--=-  .+----=:   .----=:  =:   ==.  .=       
      +-    :::::  .:   .+: :+.   +=   .+. -=    ==  +-   :. .+-   .+: .+.    =- :+  :=-=  =-       
      ==    ...:+. .----=+: :+    =-   .+. +=------  .-===:  .+:    +- -+     -+  =: +. +..+        
      .=-     .==  +:   :+: :+    =-   .+. -=    ::  :    =- .+:    +- .+:    =-  .+--  :=--        
        :-=-==-.   :=---:=: .=    -:    =.  :----:   :-----  .=.    =:  .-----:    -=    -=         
                                                                                                    

		""";
for(int i=0; i<welcome.length(); i++) {		
System.out.print(welcome.charAt(i));
try {
	Thread.sleep(3);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}	
	
	}

	
	
public void clearScreen() {
	
	
	/*
	 * 
	 * This function is supposed to clear the console between questions to give a clean experience
	 * Clearing the console not work in Eclipse IDE 
	 * 
	 * 
	 */
	//clear console for Windows
	try {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (Exception e) {
        System.out.println("Error clearing the console: " + e.getMessage());
    }
	
	
	//clear clonsole for Mac or Linux
	try {
	 System.out.print("\033[H\033[2J");
     System.out.flush();
	} catch (Exception e) {
		System.out.println("Error clearing the console: " + e.getMessage());
		
		}	
	}	
}
