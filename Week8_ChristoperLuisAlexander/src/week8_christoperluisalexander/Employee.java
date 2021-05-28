/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_christoperluisalexander;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Employee {
    protected String name;
    protected int age;
    protected String role;
    protected String type; 
    protected boolean active;
    
    public Employee(String nama,int umur,String peran,String tipe){
        this.name = nama;
        this.age = umur;
        this.role = peran;
        this.type = tipe;
        this.active = true;
    }
    
    public String getName(){
        return name;
    }
    
    public String getType(){
        return type;
    }
    
    public boolean active() {
        return active;
    }
    
    public void resign(){
        active = false;
    }
    
    public void viewdata(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
    }
}
