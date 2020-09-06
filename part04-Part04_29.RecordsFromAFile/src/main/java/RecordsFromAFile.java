
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        
         try ( Scanner scan = new Scanner(Paths.get(fileName))) {
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                
                String[] parts = row.split(",");
                System.out.println(parts[0] + ", age: " + parts[1] + " years" );
                
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

    }
}
