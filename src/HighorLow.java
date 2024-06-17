import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void hol() {
        Scanner sca = new Scanner(System.in);
        Random rand = new Random();
        int genNum = rand.nextInt((10 - 1) + 1) + 1;
        int userGuess = 0;
        String trash = "";
        boolean isDone = false;

        do {
            System.out.println("The computer has generated an integer 1-10. Guess the number: ");
            if(sca.hasNextInt()) {
                userGuess = sca.nextInt();
                if(userGuess >= 1 && userGuess <= 10) {
                    if(userGuess == genNum) {
                        System.out.println(genNum);
                        System.out.println(userGuess);
                        System.out.println("You're right on the money!");
                        isDone = true;
                    } else if (userGuess < genNum) {
                        System.out.println(genNum);
                        System.out.println(userGuess);
                        System.out.println("Your guess was low!");
                        isDone = true;
                    } else {
                        System.out.println(genNum);
                        System.out.println(userGuess);
                        System.out.println("Your guess was high!");
                        isDone = true;
                    }
                } else {
                    trash = sca.nextLine();
                    System.out.println("Not a valid input. Please enter an integer 1-10.");
                }
            } else {
                trash = sca.nextLine();
                System.out.println("Not a valid input. Please enter an integer 1-10.");
            }
        } while (!isDone);
    }
}
