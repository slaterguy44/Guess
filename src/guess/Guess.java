package guess;

import java.util.Random;
import java.util.Scanner;

/**
 * more to go
 *this line was added in GitHub
 * @author Ben Slater
 */
public class Guess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(10) +1;
        System.out.println("Guess the Number");
        int guess = sc.nextInt();

        while (true) {
            System.out.println("Enter a number: ");
            if (sc.nextInt() == number) {
                break;

            } else if (sc.nextInt() > number) {
                System.out.println("That's too high");
            } else {
                System.out.println("That's too low");
            }
        }

        System.out.println("You did it!");
    }

}
