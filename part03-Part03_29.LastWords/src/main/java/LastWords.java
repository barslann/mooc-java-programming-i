
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();

            if (s.equals("")) {
                break;
            }

            String[] arr = s.split(" ");
            System.out.println(arr[arr.length-1]);
        }


    }
}
