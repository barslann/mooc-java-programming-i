
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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int max) {
        this.maxWeight = max;
        suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
            totalWeight();
        }
    }
    
    public int totalWeight(){
        int total = 0;
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight();
        }
        
        return total;
    }
    
    public void printItems(){
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
    

    @Override
    public String toString() {
        
        String output = " (" + totalWeight() + " kg)";
        if(suitcases.isEmpty()){
            return "no items" + output;
        }
        
        String output2 = suitcases.size() + (suitcases.size() > 1 ? " suitcases" : " suitcase") + output;
        
        return output2 ;
    }
    
    
    
    
    
}
