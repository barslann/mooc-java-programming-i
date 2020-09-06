
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
public class Grade {
    private ArrayList<Double> allGrades;
    private ArrayList<Integer> star;

    public Grade() {
        allGrades = new ArrayList<>();
        star = new ArrayList<>();
    }
    
    public void addAllGrades(double point){
        this.allGrades.add(point);
    }
    
    public void addStar(int point){
        this.star.add(point);
    }
    
    
    public void average(){
        double sum = 0;
        for (Double grade : allGrades) {
            sum += grade;
        }
        double average = sum / allGrades.size();
        System.out.println("Point average (all): " + average);
    }
    
    public void averagePass(){
        double sum = 0;
        int counter =0;
        
        for (Double allGrade : allGrades) {
            if (allGrade >=50) {
                sum+= allGrade;
                counter++;
            }
        }
        
        if (allGrades.size() > 0) {
            System.out.println("Point average (passing): " +  sum / counter);
        }else{
            System.out.println("Point average (passing): " + "-");
        }
                   
    }
    
    public void percentage(){
        double counter=0;
        for (Double allGrade : allGrades) {
            if (allGrade >=50) {
                counter++;
            }
        }
        System.out.println("Pass percentage:" + 100 * (counter / allGrades.size()));
    }
    
    
    public void print(){
        for (Double allGrade : allGrades) {
            if (allGrade >=90 ) {
                addStar(5);
            }else if(allGrade >=  80){
                addStar(4);
            }else if(allGrade >= 70){
                addStar(3);
            }else if(allGrade >= 60){
                addStar(2);
            }else if(allGrade >= 50){
                addStar(1);
            }else{
                addStar(0);
            }
        }
        
        
    }
    
    
    public void distribution() {
        print();
        
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        star(countDistribution(5));
        System.out.print("4: ");
        star(countDistribution(4));
        System.out.print("3: ");
        star(countDistribution(3));
        System.out.print("2: ");
        star(countDistribution(2));
        System.out.print("1: ");
        star(countDistribution(1));
         System.out.print("0: ") ;
        star(countDistribution(0));

 

    }

 

    public int countDistribution(int number) {
        int count = 0;
        for (int integer : star) {
            if (integer == number) {
                count++;
            }
        }
        return count;
    }

 

    public void star(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("*");     
        }
        System.out.println("");
    }
    
}
