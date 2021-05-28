/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_christoperluisalexander;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Week6_ChristoperLuisAlexander {
    /**
     * @param args the command line arguments
     */
    public static void menu(){
        System.out.println("\n+======================+");
        System.out.println("+Options               +");
        System.out.println("+======================+");
        System.out.println("+1. Start Sharing      +");
        System.out.println("+2. Update Participant +");
        System.out.println("+3. Delete Participant +");
        System.out.println("+4. Close App          +");
        System.out.println("+======================+");
        System.out.print("Choice >> ");
    }
     public static void pressenter()
    { 
        System.out.print("Press enter to return to main menu..");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {
        }  
    }
    public static void addnumbershare(ArrayList<Integer> number){
        int bil;
        Scanner christoper = new Scanner(System.in);
        try{
        do{
            System.out.print("Input a number [0 - 100]: ");
            bil = christoper.nextInt();
        }while(bil<0||bil>100);
        number.add(bil);
        }
        catch(Exception e){
            System.out.println("input must be numeric");
            addnumbershare(number);
        }
    }
    public static void addusername(ArrayList <String> username,ArrayList <Integer> number){
        String name;
        Scanner christoper = new Scanner(System.in);
        do{
        System.out.print("Could you give me your username [5 - 20 characters}? ");
        name = christoper.nextLine();
        if(username.contains(name))
        {
            System.out.println("username has already been taken!!");
        }
        }while(username.contains(name)||name.length()<5||name.length()>20);
        username.add(name);
        int indeks = username.indexOf(name) + 1;
        System.out.println("You are the " + indeks + " that joins the game");
        System.out.println("You share number : " + number.get(username.indexOf(name)));
    }
    public static void checkupdatenumber(ArrayList <Integer> number,int angka)
    {
        Scanner christoper = new Scanner(System.in);
        int bil;
        int angka1 = angka-1;
        try{
            do{
                System.out.print("Input a number [0 - 100]: ");
                bil = christoper.nextInt();
            }while(bil<0||bil>100);
            number.set(angka1,bil);
        }
        catch(Exception checknumber){
            System.out.println("input must be numeric");
            checkupdatenumber(number,angka);
        }
    }
    public static void updatedata(ArrayList <String> username,ArrayList <Integer> number){
        int angka;
        Scanner christoper = new Scanner(System.in);
        try{
            do{
                System.out.println("+=======================================+");
                System.out.println("+ Share List                            +");
                System.out.print("+=======================================+");
                for(int i=0;i<username.size();i++)
                {
                    int index = i+1;
                    System.out.printf("\n| %d   | %-20s | %-8d |",index,username.get(i),number.get(i));
                }
                System.out.println("\n+=======================================+");
                if(username.size()==1)
                {
                    System.out.print("Which participant you would like to update [1][0 to exit]? "); 
                }
                else
                {
                    System.out.print("Which participant you would like to update [1 - " + username.size() + "][0 to exit]? "); 
                }
                angka = christoper.nextInt(); 
              }while(angka>username.size()||angka>number.size()||angka<0);
                if(angka!=0)
                {
                    checkupdatenumber(number,angka);
                    System.out.println("Update Successful!");
                }   
        }
        catch (Exception mustnumber)
        {
            System.out.println("input must be numeric");
            updatedata(username,number);
        }
    }
    public static void deletedata(ArrayList <String> username,ArrayList <Integer> number)
    {
        int angka;
        Scanner christoper = new Scanner(System.in);
        try{
            do{
                System.out.println("+=======================================+");
                System.out.println("+ Share List                            +");
                System.out.print("+=======================================+");
                for(int i=0;i<username.size();i++)
                {
                    int index = i+1;
                    System.out.printf("\n| %d   | %-20s | %-8d |",index,username.get(i),number.get(i));
                }
                System.out.println("\n+=======================================+");
                if(username.size()==1)
                {
                    System.out.print("Which participant you would like to delete [1][0 to exit]? "); 
                }
                else
                {
                    System.out.print("Which participant you would like to delete [1 - " + username.size() + "][0 to exit]? ");
                }
                angka = christoper.nextInt();
              }while(angka>username.size()||angka>number.size()||angka<0);
                if(angka!=0)
                {
                    int angka1 = angka-1;
                    number.remove(angka1);
                    username.remove(angka1);
                    System.out.println("Participant successfully removed from event");
                }   
        }
        catch (Exception mustnumber)
        {
            System.out.println("input must be numeric");
            deletedata(username,number);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner christoper = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<Integer>();
        ArrayList<String> username = new ArrayList<String>();
        int pilih;
        System.out.println(" _______      ___            _______  __   __  _______  ______    _______");
        System.out.println("|  _    |    |   |          |       ||  | |  ||   _   ||    _ |  |       |");
        System.out.println("| |_|   |    |   |   ____   |  _____||  |_|  ||  |_|  ||   | ||  |    ___|");
        System.out.println("|       |    |   |  |____|  | |_____ |       ||       ||   |_||_ |   |___");
        System.out.println("|  _   |  ___|   |          |_____  ||       ||       ||    __  ||    ___|");
        System.out.println("| |_|   ||       |           _____| ||   _   ||   _   ||   |  | ||   |___");
        System.out.println("|_______||_______|          |_______||__| |__||__| |__||___|  |_||_______|\n");
        do{
            menu();
            pilih = christoper.nextInt();
            switch(pilih){
                case 1:{
                    addnumbershare(number);
                    addusername(username,number);
                    pressenter();
                    break;
                }
                case 2:{
                    if(number.isEmpty()&&username.isEmpty())
                    {
                        System.out.println("There is no participant");
                        pressenter();
                        break;
                    }
                    else
                    {
                        updatedata(username,number);
                    }
                    pressenter();
                    break;
                }
                case 3:{
                    if(number.isEmpty()&&username.isEmpty())
                    {
                        System.out.println("There is no participant");
                        pressenter();
                        break;
                    }
                    else
                    {
                        deletedata(username,number);
                    }
                    pressenter();
                    break;
                }
                case 4:{
                    ArrayList<Integer> bilangan = number;
                    HashMap<String,Integer> data = new HashMap<String,Integer>();
                    String[] nama = username.toArray(new String[0]);
                    Integer[] angka = number.toArray(new Integer[0]);
                    for(int i=0;i<username.size();i++)
                    {
                        data.put(nama[i],angka[i]);
                    }
                    Collections.sort(username);
                    Collections.shuffle(bilangan);
                    Collections.reverse(bilangan);
                    System.out.println("Here's the completed share list");
                    System.out.println("Remember, sharing is caring, happy sharing :D");
                    System.out.println("+==============================================+");
                    System.out.println("+ Share List                                   +");
                    System.out.println("+==============================================+");
                    System.out.println("+ Username                 | Before  | After   +");
                    System.out.print("+==============================================+");
                    String[] name = username.toArray(new String[0]);
                    for(int i=0;i<username.size();i++)
                    {
                        System.out.printf("\n| %-24s | %-7d | %-7d |",username.get(i),data.get(name[i]),bilangan.get(i));
                    }
                    System.out.println("\n+==============================================+");
                }
            }
        }while(pilih!=4);
    }
    
}
