
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
    private JokeManager jokeManager;

    public UserInterface(JokeManager jokeManager,Scanner scanner) {
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }

    public void start() {
        while (true) {
            System.out.print("Commands: \n 1 - add a joke \n 2 - draw a joke \n 3 - list jokes \n X - stop \n");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }

            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("1")) {
            add();
        } else if (command.equals("2")) {
            draw();
        } else if (command.equals("3")) {
            print();
        }
    }

    public void add() {
        System.out.println("Write the joke to be added: ");
        String joke = scanner.nextLine();
        this.jokeManager.addJoke(joke);
    }

    public void draw() {
        System.out.println("Drawing jokes: ");
        System.out.println(this.jokeManager.drawJoke()); 
    }

    public void print() {
        System.out.println("Printing jokes:");
        this.jokeManager.printJokes();
    }

}
