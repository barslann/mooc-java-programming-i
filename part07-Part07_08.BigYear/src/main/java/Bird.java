/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bekirarslan
 */
public class Bird {
    private String name;
    private String latinName;
    private int observationNumber;

    public Bird() {
    }

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationNumber = 0;
    }
    
    

    public String getLatinName() {
        return latinName;
    }

    public String getName() {
        return name;
    }

    public int getObservationNumber() {
        return observationNumber;
    }

    public void setObservationNumber(int observationNumber) {
        this.observationNumber = observationNumber;
    }
    
    public void incrementObservationNumber(){
        this.observationNumber++;
    }

    @Override
    public String toString() {
        //Hawk (Dorkus Dorkus): 2 observations
        return name + " (" + getLatinName() + "): " + getObservationNumber() +" abservations";
    }
    
    
    
    
    
    
    
}
