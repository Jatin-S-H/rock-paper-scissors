import java.util.Random;
import java.util.Scanner;

public class rockpaperscissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play="";
        System.out.println("Enter 'play' to start the game:");
        play = sc.nextLine().trim().toLowerCase();      
        while(play.equals("play")){
        System.out.println("Enter \nR for Rock \nP for Paper \nS for scissors");
        String i = sc.nextLine().trim().toLowerCase();
        Random ra = new Random();
        int comp = ra.nextInt(3);
        String c = "";

        c = switch (comp) {
                case 0 -> "R";
                case 1 -> "P";
                default -> "S";
            };

        System.out.println("computer choose: " + c);
        c = c.toLowerCase();

        if (i.equals(c)) {
            System.out.println("It's a Draw, try again");
        } else if ((i.equals("r") && c.equals("s")) || (i.equals("p") && c.equals("r")) || (i.equals("s") && c.equals("p"))) {
            System.out.println("You Won!!, let's play again");
        } else if ((i.equals("r") && c.equals("p")) || (i.equals("p") && c.equals("s")) || (i.equals("s") && c.equals("r"))) {
            System.out.println("You Lost, try again");
        } else {
            System.out.println("Wrong input try R, P, S");
        }
        System.out.println("Enter 'play' to start the game or enter any other key to stop:");
        play = sc.nextLine().trim().toLowerCase();
       }
       System.out.println("Thank you for Playing");
       sc.close();
    }
       
    }
    

