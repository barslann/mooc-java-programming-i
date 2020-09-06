
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
public class BirdDatabase {
    private ArrayList<Bird> birds;

    public BirdDatabase() {
        birds = new ArrayList<>();
    }
    
    public void add(Bird bird){
        this.birds.add(bird);
    }
    
    public void all(){
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public void one(String name){
        if (isBird(name)) {
            System.out.println(getBird(name));
        }else{
            System.out.println("Not in the database!");
        }
    }
    
    public void observation(String name){
        if (isBird(name)) {
            Bird observedBird = getBird(name);
            observedBird.incrementObservationNumber();
        }else{
            System.out.println("Not a bird!");
        }
    }
    
    public boolean isBird(String name){
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public Bird getBird(String name){
        Bird bird1 = null;
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird1= bird;
                break;
            }
        }
        return bird1;
    }

    
    
    
    
    
}
