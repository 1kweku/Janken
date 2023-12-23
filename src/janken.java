import java.util.Random;
import java.util.Scanner;

public class janken {
    public static void main(String[] args) {
        String[] options = { "rock", "paper", "scissors" };
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int b = random.nextInt(3);
        String c = options[b];

        System.out.println("Rock, paper, or scissors?");
        String a = scanner.next();

        if (c.equals(a)) {
            System.out.println("Computer chose " + c + ", tie game");
        } else if (c.equals("rock") && a.equals("paper")) {
            System.out.println("Computer chose " + c + ", you win!");
        } else if (c.equals("paper") && a.equals("scissors")) {
            System.out.println("Computer chose " + c + ", you win!");
        } else if (c.equals("scissors") && a.equals("rock")) {
            System.out.println("Computer chose " + c + ", you win!");
        } else {
            System.out.println("Computer chose " + c + ", you lose!");
        }

        scanner.close();
    }
}
