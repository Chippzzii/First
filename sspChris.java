import java.util.*;
import java.util.concurrent.TimeUnit;

public class sspChris {

    //Methodenübergreifend wirksam
    static Scanner scan = new Scanner(System.in);
    static Random rnd = new Random();
    static int player,  pc,  scoreplayer = 0, scorepc = 0;
    static char input = 'y';

    public static void main (String[]args) {

        game();
        scan.close();


    } //Schließt Main Methode

    //Neue Methoden hier drunter

    public static void game() {


        do {
            while (scoreplayer <2 && scorepc <2) {
                System.out.println("Der Spieler wählt zuerst. Schere, Stein, Papier?");
                player = scan.nextInt();
                changePlayer();

                System.out.println("Der Computer wählt. Schere, Stein oder Papier?");
                pc = rnd.nextInt(3) + 1;
                changePc();

                runde();
            }

            if (scoreplayer == 2)
                System.out.println("Der Spieler hat gewonnen!!");
            else
                System.out.println("Der Computer hat gewonnen!!");


            System.out.println("----Nächste Runde?? (Y/N)----");
            input = scan.next().charAt(0);
            scoreplayer = 0;
            scorepc = 0;

        } while(input =='y');





    }

    public static void changePc() {
        warten();
        switch (pc) {

            case 1:
                System.out.println("Der Computer hat Schere gewählt");
                break;
            case 2:
                System.out.println("Der Computer hat Stein gewählt");
                break;
            case 3:
                System.out.println("Der Computer hat Papier gewählt");
                break;
            default:
                System.out.println("Error, Neustart.");
        }
    }

    public static void changePlayer() {
        warten();
        switch (player) {

            case 1:
                System.out.println("Du hast Schere gewählt");
                break;
            case 2:
                System.out.println("Du hast Stein gewählt");
                break;
            case 3:
                System.out.println("Du hast Papier gewählt");
                break;
            default:
                System.out.println("Kontrolliere deine Eingabe nochmal.");
        }
    }

    public static void runde() {
        if (player == pc) {
            System.out.println("Unentschieden");
        }

        else if (player == 1 && pc == 3) {
            System.out.println("Gewonnen!!!");
            scoreplayer++;
        }

        else if (player == 2 && pc == 1) {
            System.out.println("Gewonnen!!!");
            scoreplayer++;
        }
        else if (player == 3 && pc == 2) {
            System.out.println("Gewonnen!!!");
            scoreplayer++;
        }
        else   {
            warten();
            System.out.println("Verloren!!");
            scorepc++;
        }

        System.out.println("Der Spieler hat " + scoreplayer + " Punkte.");
        System.out.println("Der Computer hat " + scorepc + " Punkte");
    }

    private static void warten() {

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
        }
    }



} // Schließt die Klasse
