import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Rock {
    public static void main(String[] args) {
        PlayAGame();
        System.out.println("Do you want to play Rock,paper, scissors? Or do you want to review history");
        System.out.println("Press 1 to play the game. Press 2 to check history. Press 3 to not play the game. ");
        Scanner firstchat = new Scanner(System.in);
        int answer2 = 0;
        answer2 = firstchat.nextInt();
        if (answer2 == 1) {
            PlayAGame();
        } else if (answer2 == 2) {

            System.out.println("History");

            for (int counter = 0; counter < History.size(); counter++) { System.out.println(History.get(counter));}

        }

          else if (answer2 == 3) {
            System.out.println("Hope to play again soon.");
        }
    }
    static ArrayList<String> History = new ArrayList<>();


        public static void PlayAGame() {
        String personPlay;
        String computerPlay = "";
        int computerInt;


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        String result = new String();





        System.out.println("Hey, Let's play Rock Paper, Scissors!");
        System.out.println("Please enter a move. Press R for Rock, P for Paper, and S for scissors");
        System.out.println();
        computerInt = generator.nextInt(3) + 1;
        if (computerInt == 1) {
            computerPlay = "R";
        } else if (computerInt == 2) {
            computerPlay = "P";
        } else if (computerInt == 3) {
            computerPlay = "S";
        }

        System.out.println("Enter Your Play");
        personPlay = scan.next();
        personPlay = personPlay.toUpperCase();
        System.out.println("Computer play is: " + computerPlay);
        if (personPlay.equals(computerPlay)) {
            System.out.println("It's a tie!");
            result = "tie";
            History.add(result);
        }
        if (personPlay.equals("R"))
            if (computerPlay.equals("S")) {
                System.out.println("Rock crushes scissors. You win!");
                result = "win";
                History.add(result);
            } else if (computerPlay.equals("P")) {
                System.out.println("Paper eats Rock. You Loose!");
                result = "loose";
                History.add(result);
            }
        if (personPlay.equals("P"))
            if (computerPlay.equals("S")) {
                System.out.println("Scissor's cuts paper you loose!");
                result = "loose";
                History.add(result);
            } else if (computerPlay.equals("R")) {
                System.out.println("Paper eats Rock. You Win");
                result = "win";
                History.add(result);
            }
        if (personPlay.equals("S"))
            if (computerPlay.equals("P")) {
                System.out.println("Scissors cuts Paper. You Win!");
                result = "win";
                History.add(result);
            } else if (computerPlay.equals("R")) {
                System.out.println("Rock beats Scissors. You loose!");
                result = "loose";
                History.add(result);
            }

            System.out.println("Do you want to play again? Please type Y for Yes and N for No");
            Scanner playAgain = new Scanner(System.in);
            String answer = new String();
            answer = playAgain.next();
            if (answer.equals("Y")) {
                PlayAGame();
            } else {
                System.out.println("Thanks for playing");

            }


        }


    }






