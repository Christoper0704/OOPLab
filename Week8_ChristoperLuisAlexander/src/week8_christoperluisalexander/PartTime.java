/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_christoperluisalexander;

/**
 *
 * @author ASUS
 */
public class PartTime extends Employee{
    private int pay;
    private int work;
    
    public PartTime(String nama,int umur,String peran,String tipe,int bayaran,int kerja){
        super(nama,umur,peran,tipe);
        this.pay = bayaran;
        this.work = kerja;
        this.active = true;
    }
    
    @Override public void viewdata(){
        System.out.println("Part Time Employee");
        System.out.println("==================");
        if(active)
        {
            System.out.println("Status: active");
        }
        else
        {
            System.out.println("Status: not active");
        }
        super.viewdata();
        System.out.println("Pay per hour: " + pay);
        System.out.println("Working per week: " + work);
        int salary = pay * work * 4;
        System.out.println("Salary per month: " + salary);
    }
}
