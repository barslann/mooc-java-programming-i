
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        String name = "";
        int sum = 0;
        int counter = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            
            sum = sum + Integer.valueOf(parts[1]);
            counter++;
            
            if(parts[0].length() > length){
                length = parts[0].length();
                name = parts[0];
            }
        }
        System.out.println("Longest name:  " + name);
        System.out.println("Average of the birth years: " + sum / (double)counter );

    }
}
