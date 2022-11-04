import java.util.*;
import java.util.concurrent.TimeUnit;

public class rateZahl {
    static int searchedInt, rndInt, countTry = 1;
    static boolean searched = true;
    static Random rnd = new Random ();
    static Scanner input = new Scanner(System.in);
    static String eingabe = "y";


    public static void main(String[] args) {
        
        game();
        input.close();

    }	//close Main
    public static void win() {

            if (rndInt == searchedInt) {
                sleep();
                System.out.println("Der Computer hat die Zahl " + rndInt + " gewählt");
                sleep();
                System.out.println("Herzlichen Glückwunsch, du hast die Zahl erraten.");
                sleep();
                System.out.println("Du hast " + countTry + " Versuch benötigt um die Zahl zu erraten.");
                sleep();
            }


    }
    public static void start() {

                System.out.println("Errate welche Zahl der PC gewählt hat... ");
                rndInt = rnd.nextInt(300) + 1;
                System.out.println(rndInt); //control ki Input

                sleep();

                System.out.println("Bitte gebe eine Zahl zwischen 1 und 300 an");
                searchedInt = input.nextInt();

        do {

            while (searchedInt != rndInt ) {

                        countTry++;

                if (rndInt > searchedInt) {
                    System.out.println("Bitte geben Sie eine Zahl ein die Größer ist...");

                }

                else {
                    System.out.println("Bitte geben Sie eine Zahl ein die Kleiner ist...");

                }

                searchedInt = input.nextInt();

            }

        } while (!searched);

    }

    public static void game() {

        do {

            start();
            sleep();
            win();
            System.out.println("---Neue Runde, neues Glück!---");
            System.out.println("Möchtest du nochmal raten? (Y/N)");
            eingabe = input.next();
            sleep();

        } while (eingabe.equals("y"));
    }
    public static void sleep() {
        try {
            TimeUnit.MILLISECONDS.sleep(550);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}		//close Class
