
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        for (int i = 1; i <= end; i++) {
            factorial *= i;

        }
        System.out.println(factorial);

    }
}
