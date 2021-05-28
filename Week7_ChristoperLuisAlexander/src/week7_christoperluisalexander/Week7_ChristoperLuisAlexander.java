/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7_christoperluisalexander;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Week7_ChristoperLuisAlexander {
    /**
     * @param args the command line arguments
     */
    public static void menu(){
        System.out.println("\nHOMEMADE CAKE");
        System.out.println("=============");
        System.out.println("1. Add cake to be bake");
        System.out.println("2. Bake cake");
        System.out.println("3. Change cake topping");
        System.out.println("4. View cake list");
        System.out.println("5. Exit");
        System.out.print("Choice: ");
    }
    
    public static void pressenterkey()
    { 
        System.out.print("\nPress enter key to continue..");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {
        }  
    }
    
    public static void addcake(ArrayList<Cake> cakes){
        String fla,top;
        Scanner christoper = new Scanner(System.in);
        int flo;
        do{
            System.out.print("Choose cake flavor[Cheese | Chocolate | Vanilla](Case Sensitive): ");
            fla = christoper.nextLine();
        }while(fla.compareTo("Cheese")!=0 && fla.compareTo("Chocolate")!=0 && fla.compareTo("Vanilla")!=0);
        do{
            System.out.print("Input how many flour will be used (gram)[>0]: ");
            flo = christoper.nextInt();
        }while(flo<=0);
        christoper.nextLine();
        do{
            System.out.print("Input your cake topping[Cream | Oreo](Case Sensitive): ");
            top = christoper.nextLine();
        }while(top.compareTo("Cream")!=0 && top.compareTo("Oreo")!=0);
        Cake cake = new Cake(fla,flo,top);
        cakes.add(cake);
        System.out.println("The cake is made!\n");
        System.out.println(cakes.size() + " cake(s) are in the list");
    }
    
    public static void bakecake(ArrayList<Cake> cakes){
        int i,number;
        Scanner christoper = new Scanner(System.in);
        if(cakes.isEmpty())
        {
            System.out.println("There is no cake that has been made yet");
        }
        else
        {
            for(i=0;i<cakes.size();i++)
            {
                int indeks = i + 1;
                System.out.println("Cake number " + indeks);
                System.out.println("===========");
                cakes.get(i).showCake();
            }
            do{
                System.out.print("\nInput cake number[1.." + cakes.size() + "]: ");
                number = christoper.nextInt();
            }while(number<1 || number>cakes.size());
            if(cakes.get(number-1).isBake()==true)
            {
                System.out.println("The cake has already baked and can't be baked again.");
            }
            else
            {
                cakes.get(number-1).makeDough();
                cakes.get(number-1).bake();
            }
        }
    }
    
    public static void changetopping(ArrayList<Cake> cakes){
        int i,number;
        String newtopping;
        Scanner christoper = new Scanner(System.in);
        if(cakes.isEmpty())
        {
            System.out.println("There is no cake that has been made yet");
        }
        else
        {
            for(i=0;i<cakes.size();i++)
            {
                int indeks = i + 1;
                System.out.println("Cake number " + indeks);
                System.out.println("===========");
                cakes.get(i).showCake();
            }
            do{
                System.out.print("Input cake number[1.." + cakes.size() + "]: ");
                number = christoper.nextInt();
            }while(number<1 || number>cakes.size());
            christoper.nextLine();
            if(cakes.get(number-1).isBake()==true)
            {
                System.out.println("You can't change topping into cake which has already baked.");
            }
            else
            {
                do{
                    System.out.print("Input your new cake topping[Cream | Oreo]: ");
                    newtopping = christoper.nextLine();
                }while(newtopping.compareTo("Cream")!=0 && newtopping.compareTo("Oreo")!=0);
                cakes.get(number-1).changeTopping(newtopping);
            }
        }
    }
    
    public static void viewcake(ArrayList<Cake> cakes){
        int i;
        if(cakes.isEmpty())
        {
            System.out.println("There is no cake that has been made yet");
        }
        else
        {
            for(i=0;i<cakes.size();i++)
            {
                int indeks = i + 1;
                System.out.println("Cake number " + indeks);
                System.out.println("===========");
                cakes.get(i).showCake();
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih;
        ArrayList<Cake> cakes = new ArrayList<>();
        Scanner christoper = new Scanner(System.in);
        do{
            menu();
            pilih = christoper.nextInt();
            switch(pilih){
                case 1:{
                    addcake(cakes);
                    pressenterkey();
                    break;
                }
                case 2:{
                    bakecake(cakes);
                    pressenterkey();
                    break;
                }
                case 3:{
                    changetopping(cakes);
                    pressenterkey();
                    break;
                }
                case 4:{
                    viewcake(cakes);
                    pressenterkey();
                    break;
                }
            }
        }while(pilih!=5);
    }
    
}
