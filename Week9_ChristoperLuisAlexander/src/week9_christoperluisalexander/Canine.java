/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_christoperluisalexander;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class Canine extends Animal{
    private int walkingspeed;
    
    public Canine(String gender, String name, String genus, int speed){
        super(gender,name,genus);
        this.walkingspeed = speed;
    }
    
    @Override public void roam(){
        Random random = new Random();
        int total_range,duration;
        if(super.getRoamingTime()==0)
        {
            duration = 60;
        }
        else
        {
            duration = super.getRoamingTime();
        }
        int lama = random.nextInt(duration);
        total_range = lama * walkingspeed;
        System.out.println("roaming for total range of " + total_range + " in " + duration + " minutes");
    }
    
    @Override public void makeSound(){
        System.out.println("ruff ruff <3");
    }
    
    @Override public void makeSound1(){
        System.out.println("awooo!!");
    }
}
