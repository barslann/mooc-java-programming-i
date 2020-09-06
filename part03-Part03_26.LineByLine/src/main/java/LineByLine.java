
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();

            if (s.equals("")) {
                break;
            }

            String[] arr = s.split(" ");
            for (String arr1 : arr) {
                System.out.println(arr1);
            }

        }

    }
}
