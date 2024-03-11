import java.util.Random;
import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.print("Choose your move (Rock, Paper, or Scissors): ");
        String userMove = scanner.nextLine().toLowerCase();

        int computerIndex = random.nextInt(3);
        String computerMove = options[computerIndex];

        System.out.println("Computer chooses: " + computerMove);

        if (userMove.equals(computerMove.toLowerCase())) {
            System.out.println("It's a tie!");
        } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                (userMove.equals("paper") && computerMove.equals("rock")) ||
                (userMove.equals("scissors") && computerMove.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }

}
