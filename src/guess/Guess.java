package guess;

import java.util.Scanner;

/**
 *more to go
 * @author Ben Slater
 */
public class Guess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 5;
        System.out.println("Guess the Number");
        int guess = sc.nextInt();

        while (true) {
            System.out.println("Enter a number: ");
            if (sc.nextInt() == number) {
                break;

            } else {
                System.out.println("That's not right");
            }
        }

        System.out.println("You did it!");
    }

}
