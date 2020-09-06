
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = Integer.valueOf(scan.nextLine());
        if(age >= 0 && age <= 120){
            System.out.println("OK");
        }else{
            System.out.println("Impossible!");
        }
    }
}
