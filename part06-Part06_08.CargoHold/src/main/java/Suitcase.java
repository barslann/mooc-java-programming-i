
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
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
            totalWeight();
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Item item : items) {
            total += item.getWeight();
        }
        return total;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    @Override
    public String toString() {
        String output = " (" + totalWeight() + " kg)";
        if (items.isEmpty()) {
            return "no items" + output;
        }

        String output2 = items.size() + (items.size() > 1 ? " items" : " item") + output;

        return output2;
    }

}
