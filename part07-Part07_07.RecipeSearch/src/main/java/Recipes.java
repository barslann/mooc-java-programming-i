
import java.io.File;
import java.util.ArrayList;
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
public class Recipes {

    private ArrayList<ArrayList<String>> list1;

    public Recipes() {
        list1 = new ArrayList<>();
    }

    public void addRecipe(String fileName) {
        try ( Scanner reader = new Scanner(new File(fileName))) {
            while (reader.hasNextLine()) {
                ArrayList<String> recipe = new ArrayList<>();
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();

                    recipe.add(line);

                    if (line.equals("")) {
                        break;
                    }
                }
                this.list1.add(recipe);

            }
        } catch (Exception e) {
            System.out.println("File is not found");
        }

    }

    public void list() {
        System.out.println("Recipes:");
        for (ArrayList<String> arrayList : list1) {
            System.out.println(arrayList.get(0) + ", cooking time: " + arrayList.get(1));
        }
    }

    public void search(String searchedWord) {
        System.out.println("Recipes:");
        for (ArrayList<String> arrayList : list1) {
            if (arrayList.get(0).contains(searchedWord)) {
                System.out.println(arrayList.get(0) + ", cooking time: " + arrayList.get(1));
            }
        }
    }

    public void maxCookingTime(int maxTime) {
        System.out.println("Recipes:");
        for (ArrayList<String> arrayList : list1) {
            if (Integer.valueOf(arrayList.get(1)) <= maxTime) {
                System.out.println(arrayList.get(0) + ", cooking time: " + arrayList.get(1));
            }
        }
    }

    public void findIngredient(String ingredient) {
        System.out.println("Recipes:");
        for (int i = 0; i < list1.size(); i++) {
            if (containsIngredient(list1.get(i), ingredient)) {
                System.out.println(list1.get(i).get(0) + ", cooking time: " + list1.get(i).get(1));
            }
        }
    }

    public boolean containsIngredient(ArrayList<String> arrList, String ingredient) {
        for (String item : arrList) {
            if (item.equals(ingredient)) {
                return true;
            }
        }
        return false;
    }

}
