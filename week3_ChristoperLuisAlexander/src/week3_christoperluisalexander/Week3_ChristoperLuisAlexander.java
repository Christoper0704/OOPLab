/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_christoperluisalexander;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class Week3_ChristoperLuisAlexander {
     public static void pressenter()
 { 
        System.out.print("\nPress enter to return to main menu..");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {
        }  
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int gas = 100,speed,pilih;
        Scanner christoper = new Scanner(System.in);
        do{
            System.out.println("Your gasoline's car: " + gas + " liters");
            System.out.println("=====================");
            System.out.println("1. Start driving");
            System.out.println("2. Rest");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            pilih = christoper.nextInt();
            christoper.nextLine();
            switch(pilih){
                case 1:{
                     Random number =  new Random();
                     speed = number.nextInt(100) + 1;
                     if(speed<50 && gas>=20)
                     {
                         System.out.println("Your speed : " + speed + " km/hour");
                         gas-=20;
                         System.out.println("You have spent 20 liters gasoline");
                     }
                     else if(speed>=50 && gas>=40)
                     {
                         System.out.println("Your speed : " + speed + " km/hour");
                         gas-=40;
                         System.out.println("You have spent 40 liters gasoline");   
                     }
                     else
                     {
                         if(gas==0)
                         System.out.println("Your gasoline is not enough to run the car...");
                         else
                         System.out.println("Your gasoline is not enough to reach " + speed + " km/hour");
                     }
                     pressenter();
                     break;
                }
                case 2:{
                    if(gas==100)
                    {
                        System.out.println("Your gasoline is full...");
                    }
                    else
                    {
                        gas+=20;
                        System.out.println("Successfully recharge 20 liters gasoline...");
                    }
                    pressenter();
                    break;
                }
            }
        }while(pilih!=3); 
    }
    
}
