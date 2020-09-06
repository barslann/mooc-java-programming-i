
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bekirarslan
 */
public class UserInterface {
    private Scanner scanner;
    private Bird bird;
    private BirdDatabase db;

    public UserInterface(Bird bird, Scanner scanner,BirdDatabase database) {
        this.scanner = scanner;
        this.bird=bird;
        this.db = database;
    }
    
    public void start(){
        while (true) {            
            System.out.print("? ");
            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                db.add(new Bird(name,latinName));
            }else if(command.equals("Observation")){
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                this.db.observation(bird);            
            }
            else if(command.equals("All")){
                this.db.all();
            }else if(command.equals("All")){
                this.db.all();
            }else if(command.equals("One")){
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                this.db.one(bird);
            }
            
        }
    }
    
    
    
}
