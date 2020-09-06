//
//import java.util.Scanner;
//
//public class MainProgram {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // you can write test code here
//        // however, remove all unnecessary code when doing the final parts of the exercise
//
//        // In order for the tests to work, the objects must be created in the
//        // correct order in the main program. First the object that tracks the total
//        // sum, secondly the object that tracks the sum of even numbers, 
//        // and lastly the one that tracks the sum of odd numbers!
//        Statistics statistics = new Statistics();
//        Statistics statistics1 = new Statistics();
//        Statistics statistics2 = new Statistics();
//        System.out.println("Enter numbers: ");
//        while (true) {
//            
//            int number = Integer.valueOf(scanner.nextLine());
//            if (number == -1) {
//                break;
//            }
//
//            if (number % 2 == 0) {
//                statistics1.addNumber(number);
//            }
//
//            if (number % 2 == 1) {
//                statistics2.addNumber(number);
//            }
//
//            statistics.addNumber(number);
//
//        }
//
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Sum of even numbers: " + statistics1.sum());
//        System.out.println("Sum of odd numbers: " + statistics2.sum());
//    }
//}

import java.util.Scanner;
 
public class MainProgram {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,odd=0,even=0,all=0;
        Statistics evenNumber = new Statistics();
        Statistics oddNumber = new Statistics();
        Statistics allNumber = new Statistics();
        System.out.println("Enter numbers:");
        for(int i=0;i<i+1;i++){
            number = Integer.valueOf(scanner.nextLine());
            
            if(number==-1){
                break;
            } else if(number%2==0){
                evenNumber.addNumber(number);
                allNumber.addNumber(number);
            } else if(number%2!=0){
                oddNumber.addNumber(number);
                allNumber.addNumber(number);
            }
             
                                   
           
        }
        
        
        
        
        System.out.println("Sum: " + allNumber.sum());
        System.out.println("Sum of even numbers: "+evenNumber.sum());
        System.out.println("Sum of odd numbers: "+oddNumber.sum());
    }
}