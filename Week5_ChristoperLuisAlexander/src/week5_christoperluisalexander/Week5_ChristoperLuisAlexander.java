/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_christoperluisalexander;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Week5_ChristoperLuisAlexander {

    /**
     * @param args the command line arguments
     */
    public static void menu(){
        System.out.println("Binary Number Calculation");
        System.out.println("=========================\n");
        System.out.println("1. Binary Number");
        System.out.println("2. Binary Number with step");
        System.out.println("3. Exit\n");
        System.out.print("Choose: ");
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
    public static void binaryconvert(int number){
        String binary="",binary1,reverse;
        int i=0,quotient = number,remainder;
        do{
            remainder = quotient%2;
            quotient = quotient/2;
            binary1 = String.valueOf(remainder);
            binary = binary.concat(binary1);
            i++;
        }while(quotient>0);
        char kar[] = binary.toCharArray();
        reverse = "";
        for(i=kar.length-1;i>=0;i--)
        {
            reverse = reverse + kar[i];
        }
        System.out.print("The Result of Binary Number " + number + ": " + reverse);
        System.out.println("\n");
    }
    public static void binarystep(int number){
        String binary="",binary1,reverse;
        int i=0,quotient = number,number1 = number,number2 = number,remainder;
        System.out.println("The Result of Binary Number");
        do{
            remainder = quotient%2;
            quotient = quotient/2;
            binary1 = String.valueOf(remainder);
            binary = binary.concat(binary1);
            i++;
            System.out.println("Step " + i + ": " + number1 + "/2, Remainder = " + remainder + ", Quotient = " + quotient);
            number1 = number1/2;
        }while(quotient>0);
        char kar[] = binary.toCharArray();
        reverse = "";
        for(i=kar.length-1;i>=0;i--)
        {
            reverse = reverse + kar[i];
        }
        System.out.print("\n" + number + " in decimal = " + reverse + " in binary");
        System.out.println("\n");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner christoper = new Scanner(System.in);
        int pilih,number;
        do{
            menu();
            pilih = christoper.nextInt();
            switch(pilih){
                case 1:{
                    do{
                        System.out.print("Input the number [1-100] : ");
                        number = christoper.nextInt();
                    }while(number<1||number>100);
                    binaryconvert(number);
                    pressenter();
                    break;
                }
                case 2:{
                     do{
                        System.out.print("Input the number [1-100] : ");
                        number = christoper.nextInt();
                    }while(number<1||number>100);
                     binarystep(number);
                     pressenter();
                     break;
                }
                case 3:{
                    System.out.println("      Thank you and have a nice day.. ^^    ");
                }
            }
        }while(pilih!=3);
    }
    
}
