import java.util.Scanner;
import java.util.Random;

public class Game1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            System.out.println("Welcome to Rock , paper and Scissors game");
            System.out.println("Rules for the game \n *eter 0 for rock \n *enter 1 for paper \n *enter 2 for scissors");
            System.out.println("enter your option");
            int x = sc.nextInt();
            int y = rand.nextInt(2);
            // here 0 = rock, 1 = paper, 2= scissors
            // x is the number selected by the user
            if (x == y) {
                System.out.println("it's been a tie");
                System.out.println("play again");
            } else if (x == 0 && y == 1) {
                System.out.println("You loos the match \n\tyou choosed rock\n\t\tcomputer choosed paper");
                System.out.println("play again");
            } else if (x == 0 && y == 2) {
                System.out.println("You won the match\n\tyou choosed rock\n\t\tcomputer choosed Scissors");
                System.out.println("play again");
            } else if (x == 1 && y == 0) {
                System.out.println("You won the match\n\tyou choosed paper\n\t\tcomputer choosed rock");
                System.out.println("play again");
            } else if (x == 1 && y == 2) {
                System.out.println("You loose the match\n\tyou choosed paper\n\t\tcomputer choosed scissors");
                System.out.println("play again");
            } else if (x == 2 && y == 0) {
                System.out.println("You loose the match\n\tyou choosed scissors\n\t\tcomputer choosed rock");
                System.out.println("play again");
            } else if (x == 2 && y == 1) {
                System.out.println("You won the match\n\tyou choosed scissors\n\t\tcomputer choosed papeer");
                System.out.println("play again");
            } else {
                System.out.println("enter the correct number from 0,1,2");
            }
        }
        return;
    }
}
