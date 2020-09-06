
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        
        ArrayList<String[]> list = new ArrayList<>();
        
        try ( Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                
                String[] parts = row.split(",");
                list.add(parts);
                
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        int count=0;
        int winCount=0;
        int lossCount=0;
        for (String[] string : list) {
            if (string[0].equals(team)) {
                count++;
                if (Integer.valueOf(string[2]) > Integer.valueOf(string[3])) {
                    winCount++;
                }else{
                    lossCount++;
                }
            }
            
            if (string[1].equals(team)) {
                count++;
                if (Integer.valueOf(string[3]) > Integer.valueOf(string[2])) {
                    winCount++;
                }else{
                    lossCount++;
                }
            }
        }
       
        System.out.println("Games: " + count);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);

    }

}
