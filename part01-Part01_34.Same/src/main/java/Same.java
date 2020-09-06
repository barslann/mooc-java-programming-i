
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input two strings");
        String first = scan.nextLine();
        String second = scan.nextLine();

 

        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }  
    }
}
