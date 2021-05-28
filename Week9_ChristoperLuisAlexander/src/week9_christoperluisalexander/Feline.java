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
public class Feline extends Animal {
    private final int walkingspeed = 25;
    
    public Feline(String gender, String name, String genus){
        super(gender,name,genus);
    }
 
    @Override public void roam(){
        Random random = new Random();
        int total_range,duration;
        int number = random.nextInt(2);
        if(number==0)
        {
            System.out.println("Feline doesn't feel like roaming at all today..");
        }
        else
        {
            if(super.getRoamingTime()==0)
            {
                duration = 30;
            }
            else
            {
                duration = super.getRoamingTime()/2;
            }
            int lama = random.nextInt(duration);
            total_range = lama * walkingspeed;
            System.out.println("roaming for total range of " + total_range + " in " + duration + " minutes");
        }
    }
    
    @Override public void makeSound(){
        System.out.println("meow meow <3");
    }
    
    @Override public void makeSound1(){
        System.out.println("hiss!!");
    }

}
