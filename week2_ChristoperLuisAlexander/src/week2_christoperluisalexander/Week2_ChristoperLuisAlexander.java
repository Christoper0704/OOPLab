/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_christoperluisalexander;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Week2_ChristoperLuisAlexander{
    public static String right(String value, int length) {
        return value.substring(value.length() - length);
    }
     public static void pressenterkey()
 { 
        System.out.println("\nPress enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {
        }  
 }
    static void menu(){
        System.out.println("SUBJECT");
        System.out.println("=======");
        System.out.println("1. Mathematics");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.print("Choice: ");
    }
    static void mathmenu(){
        System.out.println("Math Menu");
        System.out.println("=========");
        System.out.println("1. Calculate circle area");
        System.out.println("2. Calculate rectangle area");
        System.out.print("Choice: ");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choose,pilih;
        Scanner christoper = new Scanner(System.in);
        do{
        menu();
        choose = christoper.nextInt();
        christoper.nextLine();
        switch(choose){
            case 1:{
                do{
                    mathmenu();
                    pilih = christoper.nextInt();
                    if(pilih==1)
                    {
                        double Area1;
                        String type;
                        do{
                        System.out.print("Choose input type[Radius | Diameter](Case Insensitive): ");
                        type = christoper.next();
                        }while(type.compareTo("Radius")!=0  && type.compareTo("radius")!=0 && type.compareTo("Diameter")!=0 && type.compareTo("diameter")!=0);
                        double number = (double)(Math.random()*(100-1+1)+1);
                        if(type.compareTo("Radius")==0 && type.compareTo("radius")==0)
                        {
                            Area1 = Math.PI * Math.pow(number, 2);
                            System.out.println("===============================================");
                            System.out.println("The generated radius value is " + number);
                            System.out.println("The area of the circle is " + Area1);
                            pressenterkey();
                        }
                        else
                        {
                            Area1 = Math.PI * Math.pow(number/2, 2);
                            System.out.println("=================================================");
                            System.out.println("The generated diameter value is " + number);
                            System.out.println("The area of the circle is " + Area1);
                            pressenterkey();
                        }  
                    }
                    else
                    {
                        double Area2,width,length;
                        String rectangle;
                        System.out.print("Input width and length[format: WidthxLength]: ");
                        rectangle = christoper.next();
                        rectangle.matches("\\d{2}x\\d{2}");
                        String segment[] = rectangle.split("x");
                        width = Double.parseDouble(segment[0]);
                        length = Double.parseDouble(segment[1]);
                        Area2 = width * length;
                        System.out.println("The area of rectangle is " + Area2);
                        pressenterkey();
                    }
                }while(pilih!=1 && pilih!=2);
                break;
                }
            case 2:{
                String word,tense;
                do{
                System.out.print("Input word[only 1 word | must only be alphabet]: ");
                word = christoper.nextLine();
                }while(word.compareTo("")==0 || !word.matches("^[a-zA-Z]*$") || word.contains(" "));
                do{
                    System.out.print("Input tenses type[Present | Past](Case Sensitive): ");
                    tense = christoper.nextLine();
                }while(tense.compareTo("Present")!=0 && tense.compareTo("Past")!=0);
                if(tense.compareTo("Present")==0)
                {
                    if(right(word,2).compareTo("es")==0 || right(word,1).compareTo("s")==0)
                    {
                        System.out.println("===================================");
                        System.out.println(word + " is prural word");
                        System.out.println("It contains of " + word.length() + " character(s)");
                        pressenterkey();
                    }
                    else
                    {
                        System.out.println("===================================");
                        System.out.println(word + " is singular word");
                        System.out.println("It contains of " + word.length() + " character(s)");
                        pressenterkey();
                    }
                }
                else
                {
                    if(right(word,2).compareTo("ed")==0 || right(word,1).compareTo("d")==0)
                    {
                        System.out.println("===================================");
                        System.out.println(word + " is regular word");
                        System.out.println("It contains of " + word.length() + " character(s)");
                        pressenterkey();
                    }
                    else
                    {
                        System.out.println("===================================");
                        System.out.println(word + " is irregular word");
                        System.out.println("It contains of " + word.length() + " character(s)");
                        pressenterkey();
                    }
                }
                break;
            }
          }
        }while(choose!=3);   
    }
    
}
