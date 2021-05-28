/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_christoperluisalexander;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class Week9_ChristoperLuisAlexander {
    
    public final static ArrayList<Animal> animal = new ArrayList<>();
    public static int maxcan=0, maxfel=0, nowcan=0, nowfel=0; 
    
    public static void lanjut()
    { 
        System.out.print("");
        try
        {
            System.in.read();
        }  
        catch(IOException e)
        {
        }  
    }
    
    public static void menu(){
        System.out.println("+=======================+");
        System.out.println("+ Menu List             +");
        System.out.println("+=======================+");
        System.out.println("+ 1. Add Zoo Animal     +");
        System.out.println("+ 2. View Zoo Animal    +");
        System.out.println("+ 3. Take For A Walk    +");
        System.out.println("+ 4. Release Zoo Animal +");
        System.out.println("+ 5. Close Program      +");
        System.out.println("+=======================+");
        System.out.print("Choice >> ");
    }
    
    public static void updatemood(){
        int i;
        for(i=0;i<animal.size();i++)
            {
                if(animal.get(i).getGenus().compareTo("canine")==0)
                {
                    if(nowcan == 1 && maxcan == 1)
                    {
                        animal.get(i).setMood("happy");
                    }
                    else if(nowcan<maxcan)
                    {
                        animal.get(i).setMood("happy");
                    }
                    else
                    {
                        animal.get(i).setMood("unhappy");
                    }
                }
                else if(animal.get(i).getGenus().compareTo("feline")==0)
                {
                    if(nowfel == 1 && maxfel == 1)
                    {
                        animal.get(i).setMood("unhappy");
                    }
                    else if(nowfel<maxfel)
                    {
                        animal.get(i).setMood("unhappy");
                    }
                    else
                    {
                        animal.get(i).setMood("happy");
                    }
                }
            }
    }
    
    public static void addanimal(){
        String name, gender, genus,cepat;
        int speed;
        Scanner christoper = new Scanner(System.in);
        System.out.println("");
        do{
            System.out.print("What's the name [5 - 15 characters]? ");
            name = christoper.nextLine();
        }while(name.length()<5 || name.length()>15);
        do{
            System.out.print("What's its gender [male | female]? ");
            gender = christoper.nextLine();
        }while(gender.compareTo("male")!=0 && gender.compareTo("female")!=0);
        do{
            System.out.print("What's its genus [canine | feline]? ");
            genus = christoper.nextLine();
        }while(genus.compareTo("canine")!=0 && genus.compareTo("feline")!=0);
        
        if(genus.compareTo("canine")==0)
        {
            do{
                do{
                    System.out.print("What's its speed [1 - 80]? ");
                    cepat = christoper.nextLine();
                }while(!cepat.matches("[0-9]*$"));
                speed = Integer.parseInt(cepat);
            }while(speed<1 || speed>80);

            Canine can = new Canine(gender,name,genus,speed);
            animal.add(can);
            maxcan++;
            nowcan++;
        }
        else
        {
            Feline fel = new Feline(gender,name,genus);
            animal.add(fel);
            maxfel++;
            nowfel++;
        }
        System.out.println("Another animal has joined the zoo!!");
    }
    
    public static void viewanimal(){
        int i;
        System.out.println("+=========================================================+");
        System.out.println("+ No. | Name             | Genus    | Mood       | Gender +");
        System.out.println("+=========================================================+");
        if(animal.isEmpty())
        {
            System.out.println("+ No Zoo Animal Spotted                                   +");
        }
        else
        {
            updatemood();
            for(i=0;i<animal.size();i++)
            {
                System.out.printf("+ %d   | %-16s | %-8s | %-10s | %-6s |\n",i+1,animal.get(i).getName(),animal.get(i).getGenus(),animal.get(i).getMood(),animal.get(i).getGender());
            }
        }
        System.out.println("+=========================================================+");
    }
    
    public static void takewalk(){
        int choice,roaming,time,i;
        String pilih;
        Scanner christoper = new Scanner(System.in);
        System.out.println("\n+=========================================================+");
        System.out.println("+ No. | Name             | Genus    | Mood       | Gender +");
        System.out.println("+=========================================================+");
        if(animal.isEmpty())
        {
            System.out.println("+ No Zoo Animal Spotted                                   +");
            System.out.println("+=========================================================+");
        }
        else
        {
            updatemood();
            for(i=0;i<animal.size();i++)
            {
                System.out.printf("+ %d   | %-16s | %-8s | %-10s | %-6s |\n",i+1,animal.get(i).getName(),animal.get(i).getGenus(),animal.get(i).getMood(),animal.get(i).getGender());
            }
            System.out.println("+=========================================================+");
            do{
                do{
                    System.out.print("Choose animal to take for a stroll [1 - " + animal.size() + "]: ");
                    pilih = christoper.nextLine();
                }while(!pilih.matches("[0-9]*$"));
                choice = Integer.parseInt(pilih);
            }while(choice<1 || choice>animal.size());
            do{
                System.out.print("Input roaming time [0 - 50]: ");
                time = christoper.nextInt();
            }while(time<0 || time>50);
            if(time==0)
            {
                roaming=60;
            }
            else
            {
                roaming=time;
            }
            animal.get(choice-1).setRoamingTime(roaming);
            animal.get(choice-1).roam();
        }
    }
    
    public static void releaseanimal(){
        int i,choice;
        String pilih;
        Scanner christoper = new Scanner(System.in);
        System.out.println("\n+=========================================================+");
        System.out.println("+ No. | Name             | Genus    | Mood       | Gender +");
        System.out.println("+=========================================================+");
        if(animal.isEmpty())
        {
            System.out.println("+ No Zoo Animal Spotted                                   +");
            System.out.println("+=========================================================+");
        }
        else
        {
            updatemood();
            for(i=0;i<animal.size();i++)
            {
                System.out.printf("+ %d   | %-16s | %-8s | %-10s | %-6s |\n",i+1,animal.get(i).getName(),animal.get(i).getGenus(),animal.get(i).getMood(),animal.get(i).getGender());
            }
            System.out.println("+=========================================================+");
            do{
                do{
                    System.out.print("Choose animal that wants to be released [1 - " + animal.size() + "]: ");
                    pilih = christoper.nextLine();
                }while(!pilih.matches("[0-9]*$"));
                choice = Integer.parseInt(pilih);
            }while(choice<1 || choice>animal.size());
            Random random = new Random();
            int nomor = animal.size();
            int number = random.nextInt(nomor);
            
            if(animal.get(choice-1).getGenus().compareTo("canine")==0)
            {
                if(animal.get(number).getGenus().compareTo("canine")==0)
                {
                    if(animal.get(choice-1).getGender().compareTo(animal.get(number).getGender())!=0)
                    {
                        animal.get(choice-1).makeSound();
                        if(choice-1==number)
                        {
                            animal.remove(choice-1);
                            nowcan--;
                        }
                        else
                        {
                            System.out.println("Your random animal partner is: " + animal.get(number).getName());
                            animal.remove(choice-1);
                            animal.remove(number);
                            nowcan-=2;
                        }
                    }
                    else
                    {
                        animal.get(choice-1).makeSound1();
                        animal.remove(choice-1);
                        nowcan--;
                    }
                }
                else{
                    animal.get(choice-1).makeSound1();
                    animal.remove(choice-1);
                    nowcan--;
                }
            }
            else if(animal.get(choice-1).getGenus().compareTo("feline")==0)
            {
                if(animal.get(number).getGenus().compareTo("feline")==0)
                {
                    if(animal.get(choice-1).getGender().compareTo(animal.get(number).getGender())!=0)
                    {
                        animal.get(choice-1).makeSound();
                        if(choice-1 == number)
                        {
                            animal.remove(choice-1);
                            nowfel--;
                        }
                        else
                        {
                            System.out.println("Your random animal partner is: " + animal.get(number).getName());
                            animal.remove(choice-1);
                            animal.remove(number);
                            nowfel-=2;
                        }
                    }
                    else
                    {
                        animal.get(choice-1).makeSound1();
                        animal.remove(choice-1);
                        nowfel--;
                    }
                }
                else{
                    animal.get(choice-1).makeSound1();
                    animal.remove(choice-1);
                    nowfel--;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih;
        Scanner christoper = new Scanner(System.in);
        
        System.out.println(" _______        __             ______    ______    ______");
        System.out.println("/\\  ==  \\      /\\ \\           /\\___  \\  /\\  __ \\  /\\  __ \\");
        System.out.println("\\ \\   __<     _\\_\\ \\          \\/_/  /__ \\ \\ \\/\\ \\ \\ \\ \\/\\ \\");
        System.out.println(" \\ \\______\\  /\\_____\\           /\\_____\\ \\ \\_____\\ \\ \\_____\\");
        System.out.println("  \\/______/  \\/_____/           \\/_____/  \\/_____/  \\/_____/\n");
        do{
            menu();
            pilih = christoper.nextInt();
            switch(pilih){
                case 1:{
                    addanimal();
                    lanjut();
                    break;
                }
                case 2:{
                    viewanimal();
                    lanjut();
                    break;
                }
                case 3:{
                    takewalk();
                    lanjut();
                    break;
                }
                case 4:{
                    releaseanimal();
                    lanjut();
                    break;
                }
            }
        }while(pilih!=5);  
    }
}
