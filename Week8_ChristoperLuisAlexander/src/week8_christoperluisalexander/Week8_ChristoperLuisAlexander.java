/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_christoperluisalexander;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Week8_ChristoperLuisAlexander {
    public static void pressenter()
    { 
        System.out.print("\nPress enter to continue..");
        try
        {
            System.in.read();
        }  
        catch(IOException e)
        {
        }  
    }
    
    public static void menu(){
        System.out.println("\nABC EMPLOYEE DATA");
        System.out.println("=================");
        System.out.println("1. Add Employee");
        System.out.println("2. View Employee");
        System.out.println("3. Resign");
        System.out.println("4. Exit");
        System.out.print("Choice: ");
    }
    
    public static void addemp(ArrayList<Employee> employee){
        String nama,peran,tipe;
        int umur,bayaran,kerja,gaji;
        Scanner christoper = new Scanner(System.in);
        
        do{
            System.out.print("Input empolyee name[must be more than 3 characters]: ");
            nama = christoper.nextLine();
        }while(nama.length()<=3);
        do{
            System.out.print("Input employee age[>= 17]: ");
            umur = christoper.nextInt();
            christoper.nextLine();
        }while(umur<17);
        do{
            System.out.print("Input employee role[Assistant | Programmer](Case Sensitive): ");
            peran = christoper.nextLine();
        }while(peran.compareTo("Assistant")!=0 && peran.compareTo("Programmer")!=0);
        do{
            System.out.print("Input employee type[PartTime | FullTime](Case Sensitive): ");
            tipe = christoper.nextLine();
        }while(tipe.compareTo("PartTime")!=0 && tipe.compareTo("FullTime")!=0);
        
        if(tipe.compareTo("PartTime")==0)
        {
            do{
                System.out.print("Input pay per hour[=>10000]: ");
                bayaran = christoper.nextInt();
                christoper.nextLine();
            }while(bayaran<10000);
            do{
                System.out.print("Input working hour per week[>0]: ");
                kerja = christoper.nextInt();
                christoper.nextLine();
            }while(kerja<=0);
            PartTime part = new PartTime(nama,umur,peran,tipe,bayaran,kerja);
            employee.add(part);
        }
        else
        {
            do{
                System.out.print("Input base salary[=>10000]: ");
                gaji = christoper.nextInt();
                christoper.nextLine();
            }while(gaji<10000);
            FullTime full = new FullTime(nama,umur,peran,tipe,gaji);
            employee.add(full);
        }
        System.out.println("Success insert employee data");
    }
    
    public static void viewemp(ArrayList<Employee> employee){
        int i;
        if(employee.isEmpty())
        {
            System.out.println("There is no employee data in the list");
        }
        else
        {
           for(i=0;i<employee.size();i++)
           {
               System.out.println("\nEmployee no. " + (i+1));
               employee.get(i).viewdata();
           }
        }
    }
    
    public static void resign(ArrayList<Employee> employee){
        Scanner christoper = new Scanner(System.in);
        int number;
        int i;
        if(employee.isEmpty())
        {
            System.out.println("There is no employee data in the list");
        }
        else
        {
           for(i=0;i<employee.size();i++)
           {
               System.out.println("\nEmployee no. " + (i+1));
               employee.get(i).viewdata();
           }
           System.out.println("\n");
            do{
                System.out.print("Input employee number that want to resign[1.." + employee.size() + "]: ");
                number = christoper.nextInt();
            }while(number<1 || number>employee.size());
            if(employee.get(number-1).active()==false){
                System.out.println("Employee has already resigned!");
            }
            else{
                employee.get(number-1).resign();
                System.out.println(employee.get(number-1).getName() + " is resigning...");
            }
        }        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner christoper = new Scanner(System.in);
        ArrayList<Employee> employee = new ArrayList<>();
        int pilih;
        
        do{
            menu();
            pilih = christoper.nextInt();
            
            switch(pilih){
                case 1:{
                    addemp(employee);
                    pressenter();
                    break;
                }
                case 2:{
                    viewemp(employee);
                    pressenter();
                    break;
                }
                case 3:{
                    resign(employee);
                    pressenter();
                    break;
                }
            }
        }while(pilih!=4);
    }
    
}
