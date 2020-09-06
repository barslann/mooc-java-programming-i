
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
    private Grade grade;

    public UserInterface(Grade grade,Scanner scanner) {
        this.scanner = scanner ;
        this.grade = grade;
    }
    
    public void start(){
    
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            double grade = Double.valueOf(scanner.nextLine());
            
            if (grade == -1) {
                break;
            }
            
            if (grade >= 0 && grade <=100) {
                this.grade.addAllGrades(grade);
            }
              
        }
        
        grade.average();
        grade.averagePass();
        grade.percentage();
        grade.distribution();
        
    }

    
}
