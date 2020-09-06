
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try ( Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                int row = Integer.valueOf(scan.nextLine());
                list.add(row);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        int count=0;
        for (Integer integer : list) {
            if (integer >= lowerBound && integer <= upperBound) {
                count++;
            }
        }
        
        System.out.println("Numbers: " + count);

    }

}
