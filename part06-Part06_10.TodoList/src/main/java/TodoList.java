
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bekirarslan
 */
public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }
    
    public void add(String task){
        this.tasks.add(task);
    }
    
    public void print(){
        int index = 1;
        for (String task : tasks) {
            System.out.println(index + ": " + task);
            index++;
        }
    }
    
    public void remove(int number){
        this.tasks.remove(number-1);
    }
    
    
}
