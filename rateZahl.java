import java.util.*;

public class rateZahl {
	 static int searchedInt, rndInt, countTry = 1;
     static boolean searched = true;
     static Random rnd = new Random ();
     static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        

    	start();
    	win();
    	input.close();
    	
    
    
    }	//close Main
    public static void win() {
	 if(rndInt == searchedInt) {
		 System.out.println("Der Computer hat die Zahl " + rndInt + " gewählt");
		 System.out.println("Herzlichen Glückwunsch, du hast die Zahl erraten.");
		 System.out.println("Du hast " + countTry + " Versuch benötigt um die Zahl zu erraten.");
	 }
    
    }
    public static void start() {
    	System.out.println("Errate welche Zahl der PC gewählt hat... ");
        rndInt = rnd.nextInt(300) + 1;
        System.out.println(rndInt); //controll ki Input

        System.out.println("Bitte gebe eine Zahl zwischen 1 und 300 an");
        searchedInt = input.nextInt();        

    do {

        while (searchedInt != rndInt ){
        	
        	 if (rndInt > searchedInt) {
                 System.out.println("Bitte geben Sie eine Zahl ein die Größer ist...");
                    countTry++;
                }

        	 else 
                {System.out.println("Bitte geben Sie eine Zahl ein die Kleiner ist...");
                    countTry++;
                }
        	 searchedInt = input.nextInt();
        	 
        	 
        	} 
        
    	} while (!searched);
    	
    }
   
}		//close Class