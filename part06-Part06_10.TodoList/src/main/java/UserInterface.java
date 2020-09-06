
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
    private TodoList todolist;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.scanner = scanner;
        this.todolist = todolist;
    }
    
    public void start(){
        
        while (true) {            
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            processCommand(command);
            
            
        }
        
    }

    private void processCommand(String command) {
        if (command.equals("add")) {
            add();
        }else if(command.equals("list")) {
            list();
        }else if(command.equals("remove")) {
            remove();
        }
    }

    private void add() {
        System.out.print("To add: ");
        String addedTask = scanner.nextLine();
        this.todolist.add(addedTask);
    }

    private void list() {
        this.todolist.print();
    }

    private void remove() {
        System.out.print("Which one is removed? ");
        int removedTaskIndex = scanner.nextInt();
        this.todolist.remove(removedTaskIndex);
        scanner.nextLine();
    }
    
    
}
