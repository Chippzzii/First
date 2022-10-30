import java.util.*;
import java.util.concurrent.TimeUnit;

public class rateZahl {
    static int searchedInt, rndInt, countTry = 1;
    static boolean searched = true;
    static Random rnd = new Random ();
    static Scanner input = new Scanner(System.in);
    static char eingabe = 'y';

    public static void main(String[] args) {


        game();
        input.close();



    }	//close Main
    public static void win() {

               if(rndInt == searchedInt) {

                   System.out.println("Der Computer hat die Zahl " + rndInt + " gewählt");
                   sleep();
                   System.out.println("Herzlichen Glückwunsch, du hast die Zahl erraten.");
                   sleep();
                   System.out.println("Du hast " + countTry + " Versuch benötigt um die Zahl zu erraten.");
                   sleep();

               }

           }


    public static void sleep() {
        try {
            TimeUnit.MILLISECONDS.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void start() {
        System.out.println("Errate welche Zahl der PC gewählt hat... ");
        rndInt = rnd.nextInt(300) + 1;
        System.out.println(rndInt); //controll ki Input, for actually gameplay, remove this line

        System.out.println("Bitte gebe eine Zahl zwischen 1 und 300 an");
        searchedInt = input.nextInt();

        do {

            while (searchedInt != rndInt ) {

                if (rndInt > searchedInt) {
                    sleep();
                    System.out.println("Bitte geben Sie eine Zahl ein die Größer ist...");
                    countTry++;
                }  else  {
                        sleep();
                        System.out.println("Bitte geben Sie eine Zahl ein die Kleiner ist...");
                        countTry++;
                }
                searchedInt = input.nextInt();


            }

        } while (!searched);

    }

    public static void game() {
        do {
            while (searchedInt == rndInt) {
                start();
                sleep();
                win();

                System.out.println("---Neue Runde, neues Glück!---");
                System.out.println("Möchtest du nochmal raten? (Y/N)");
                eingabe = input.next().charAt(0);
                sleep();

            }
        } while (eingabe == 'y');
    }

}		//close Class
