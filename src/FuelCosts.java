import java.util.Scanner;
public class FuelCosts {
    public static void fcs() {
        Scanner sca = new Scanner(System.in);
        double tankGal = 0;
        double mpgNum = 0;
        double ppgNum = 0;
        double t$p100m;
        double howFar;
        String trash = "";
        boolean isDone = false;

        do {
            System.out.println("Enter current gallons of gas in tank ");
            if(sca.hasNextDouble()) {
                tankGal = sca.nextDouble();
                isDone = true;
            } else {
                trash = sca.nextLine();
                System.out.println("Not a valid input. Please enter a number.");
            }
        } while (!isDone);

        isDone = false;

        do {
            System.out.println("Enter you car's mpg ");
            if(sca.hasNextDouble()) {
                mpgNum = sca.nextDouble();
                isDone = true;
            } else {
                trash = sca.nextLine();
                System.out.println("Not a valid input. Please enter a number.");
            }
        } while (!isDone);

        isDone = false;

        do {
            System.out.println("Enter the price per gallon for gas ");
            if(sca.hasNextDouble()) {
                ppgNum = sca.nextDouble();
                isDone = true;
            } else {
                trash = sca.nextLine();
                System.out.println("Not a valid input. Please enter a number.");
            }
        } while (!isDone);

        t$p100m = 100 / ((1/mpgNum) * 100) * ppgNum;
        howFar = tankGal * mpgNum;
        System.out.println("The cost per 100 miles is " + t$p100m);
        System.out.println("You can go " + howFar + " with the gas currently in your tank");
    }
}
