
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recipes recipes = new Recipes();
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        recipes.addRecipe(fileName);
        System.out.println("");
        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("Enter the command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                recipes.list();
            } else if (command.equals("find name")) {
                System.out.print("Seached word: ");
                String searchedWord = scanner.nextLine();
                recipes.search(searchedWord);
            }else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time:  ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                recipes.maxCookingTime(maxCookingTime);
            }else if (command.equals("find ingredient")) {
                System.out.print("Ingredient:  ");
                String ingredient = scanner.nextLine();
                recipes.findIngredient(ingredient);
            }

        }

    }

}
