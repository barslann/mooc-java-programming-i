
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int countP = 0;
        int countN = 0;
        double avg = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {

                break;
            }
            if (number > 0) {
                countP = countP + 1;
                sum = sum + number;
                avg = (double) sum / countP;
            } else if (number < 0) {
                countN = countN + 1;
            }

        }
        if (countN + countP == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + avg);
        }

    }
}
