/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bekirarslan
 */
public class Fitbyte {
    private int age;
    private int heartRate;

    public Fitbyte(int age, int heartRate) {
        this.age = age;
        this.heartRate = heartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double maxHeartRate = 206.3 - (0.711 * this.age);
        return ((maxHeartRate -  this.heartRate) * percentageOfMaximum + this.heartRate); 
    }
}
