import java.util.Scanner;
public class CtoFConverter {
    public static void ctfc() {
        Scanner sca = new Scanner(System.in);
        double cVal;
        double fVal;
        String trash = "";
        boolean isDone = false;

        do {
            System.out.println("Enter temp in Celsius ");
            if(sca.hasNextDouble()) {
                cVal = sca.nextDouble();
                fVal = (cVal * ((double) 9/5)) + 32.0;
                System.out.println("The value in F is " + fVal);
                isDone = true;
            } else {
                trash = sca.nextLine();
                System.out.println("Not a valid input. Please enter a number.");
            }
        } while (!isDone);
    }
}
