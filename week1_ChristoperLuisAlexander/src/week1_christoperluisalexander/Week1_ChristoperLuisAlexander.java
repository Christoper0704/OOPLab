/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1_christoperluisalexander;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Week1_ChristoperLuisAlexander {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner christoper = new Scanner(System.in);
        int pilih,meat=0,vege=0;
        do{
        System.out.println("\nWelcome to Yummy Delivery Pizza");
        System.out.println("===============================");
        System.out.println("1. Order Pizza");
        System.out.println("2. Pay");
        System.out.println("3. Exit\n");
        System.out.println("Choose: ");
        pilih = christoper.nextInt();
        
        switch(pilih){
            case 1 : {
                int pesan;
                System.out.println("Choose an order");
                System.out.println("===============");
                System.out.println("1. Meat Lover Pizza <@ Rp. 80000,->");
                System.out.println("2. Vegetarian Pizza <@ Rp. 50000,->\n");
                do{
                System.out.println("Which pizza do you want to order [1-2]: ");
                pesan = christoper.nextInt();
                }while(pesan != 1 && pesan != 2);  
                if(pesan==1)
                {
                    meat++;
                }
                else if(pesan == 2)
                {
                    vege++;
                }
                System.out.println("Thank You...");
                break;
            }
            case 2 : {
                int payment,change,totalprice;
                if(meat == 0 && vege == 0)
                {
                    System.out.println("You are not buy anything\n\n");
                }
                else
                {
                    System.out.println("You have ordered " + meat + " Meat Lover Pizza<s> and " + vege + " Vegetarian Pizza<s>.\n");
                    totalprice = meat * 80000 + vege * 50000;
                    System.out.println("Total Price: Rp. " + totalprice);
                    do{
                        System.out.println("Input your money [minimum Rp. " + totalprice + "] : ");
                        payment = christoper.nextInt();
                    }while(payment < totalprice);
                    change = payment - totalprice;
                    System.out.println("Your change : Rp. " + change);
                    System.out.println("Thank you...");
                    meat=0;
                    vege=0;
                }
                break;
        }
    }
  }while(pilih!=3);
 }
}
