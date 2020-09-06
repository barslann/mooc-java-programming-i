
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
//        int[] array = {3, 5, 5, 99, 2, 12};
//        System.out.println("Smallest: " + MainProgram.smallest(array));
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
//        int[] numbers = {-1, 6, 9, 8, 12};
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

//        int[] numbers = {3, 2, 5, 4, 8};
//
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
       // int[] numbers = {-1, 3, 1, 7, 4, 5, 2, 4, 3};
        
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
     //   System.out.println(indexOfSmallestFrom(numbers, 3));
        

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int[] newArray = Arrays.copyOfRange(table, startIndex, table.length);
        System.out.println(Arrays.toString(newArray));
        return indexOfSmallest(newArray) + startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {   
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

}
