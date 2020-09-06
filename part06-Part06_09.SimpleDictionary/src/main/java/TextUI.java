
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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
              //  System.out.println("Bye bye!");
                break;
            }

            processCommand(command);

//            if (command.equals("add")) {
//                System.out.print("Word:");
//                String word = scanner.nextLine();
//                System.out.print("Translation:");
//                String translation = scanner.nextLine();
//                dictionary.add(word, translation);
//                continue;
//            }
//
//            if (command.equals("search")) {
//                System.out.print("To be translated:");
//                String toBeTranslated = scanner.nextLine();
//                String translation = dictionary.translate(toBeTranslated);
//                if (translation == null) {
//                    System.out.println("Word " + toBeTranslated + " was not found");
//                } else {
//                    System.out.println("Translation: " + translation);
//                }
//                continue;
//            }

//            System.out.println("Unknown command");
        }
        
        System.out.println("Bye bye!");

    }

    private void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.print("Word:");
        String word = scanner.nextLine();
        System.out.print("Translation:");
        String translation = scanner.nextLine();
        dictionary.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated:");
        String toBeTranslated = scanner.nextLine();
        String translation = dictionary.translate(toBeTranslated);
        if (translation == null) {
            System.out.println("Word " + toBeTranslated + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }
}
