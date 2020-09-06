import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        while (true) {            
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            book.add(new Book(title,pages,year));
        }
        
        System.out.println("What information will be printed? ");
        String info = scanner.nextLine();
        for (Book object : book) {
            if (info.equals("everything")) {
                System.out.println(object.getTitle() +  ", " + object.getPages() + " pages" + ", " + object.getPublicationYear());
            }else if (info.equals("name")){
                System.out.println(object.getTitle());
            }
        }
 
        

    }
}
