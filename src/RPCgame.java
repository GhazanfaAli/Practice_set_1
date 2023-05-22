import java.util.Random;
import  java.util.Scanner;
import java.util.random.*;


public class RPCgame {
// --> choices for r, p, s

    public static String get_choice(int choice) {
        String name = null;
        switch (choice) {
            case 0: {
                name = "Rock";
                break;
            }
            case 1: {
                name = "Paper";
                break;
            }
            case 2: {
                name = "Scissor";
                break;
            }
        }
        return name;

    }
    public static void main(String args[]) {
        int UserScore = 0;
        int ComputerScore = 0;
        for(int  i = 0; i<=2; i++) {
            //-->  user's choice.
            System.out.println("0:Rock, 1:Paper, 2:Scissor");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            // --> computer's choice.
            Random random = new Random();
            int computerChoice = random.nextInt(3);
            String winner = null;


            if (computerChoice == userChoice) {
                winner = "Draw";
            } else if (userChoice == 0 && computerChoice == 2 || userChoice == 2 && computerChoice == 1 || userChoice == 1 && computerChoice == 0) {
                winner = "User";
                UserScore++;

            } else {
                winner = "Computer";
                ComputerScore++;
            }

            System.out.println("User choose \t==> " + get_choice(userChoice));
            System.out.println("Computer choose ==> " + get_choice(computerChoice));
            System.out.println("Winner \t\t\t==> " + "** "+winner+" **");
            System.out.println();
        }
        System.out.println("________Total Score________");
        System.out.println("UserScore \t\t==> "+UserScore);
        System.out.println("ComputerScore \t==> "+ComputerScore);
    }

}



