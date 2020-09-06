
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();

            if (s.equals("")) {
                break;
            }

            String[] arr = s.split(" ");
            for (String word : arr) {
                if(word.contains("av")){
                    System.out.println(word);
                }
            }

        }


    }
}
