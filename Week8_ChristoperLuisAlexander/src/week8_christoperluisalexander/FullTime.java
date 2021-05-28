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
public class FullTime extends Employee{
    private int basesal;
    
    public FullTime(String nama,int umur,String peran,String tipe,int gaji){
        super(nama,umur,peran,tipe);
        this.basesal = gaji;
        this.active = true;
    }
    
    @Override public void viewdata(){
        System.out.println("Full Time Employee");
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
        System.out.println("Base salary per month: " + basesal);
    }
}
