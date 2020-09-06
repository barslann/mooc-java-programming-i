/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bekirarslan
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hundrethsSecond;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundrethsSecond = new ClockHand(100);
    }

    @Override
    public String toString() {
        return seconds + ":" + hundrethsSecond;
    }
    
    public void advance() {
        this.hundrethsSecond.advance();

        if (this.hundrethsSecond.value() == 0) {
            this.seconds.advance();
        }
    }
    
}
