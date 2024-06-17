import java.util.Scanner;
import java.lang.Math;
public class RectangleInfo {
    public static void rctinf() {
        Scanner sca = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area;
        double perimeter;
        double diagonal;
        String trash = "";
        boolean isDone = false;

        do {
            System.out.println("Enter width");
            if(sca.hasNextDouble()) {
               width = sca.nextDouble();
               isDone = true;
            } else {
                trash = sca.nextLine();
                System.out.println("Not a valid input. Please enter a number.");
            }
        } while (!isDone);

        isDone = false;

        do {
            System.out.println("Enter height");
            if(sca.hasNextDouble()) {
                height = sca.nextDouble();
                isDone = true;
            } else {
                trash = sca.nextLine();
                System.out.println("Not a valid input. Please enter a number.");
            }
        } while (!isDone);

        area = width * height;
        perimeter = (width * 2) + (height * 2);
        diagonal = Math.sqrt((width * width) + (height * height));

        System.out.println("The area is " + area + ". " + "The perimeter is " + perimeter + ". " + "The diagonal is " + diagonal + ".");
    }
}
