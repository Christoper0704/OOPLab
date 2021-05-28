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
    public class Cake {

	private String flavor;
	private String topping;
	private int flour;
	private final int sugar = 100;
	private boolean isBake = false;
	
	public Cake(String fla, int flo, String top) {
		this.flavor = fla;
                this.flour = flo;
		this.topping = top;
	}
	
	public void makeDough() {
		System.out.println("\nMixing " + this.flavor + " flavor, " 
                                               + this.flour + " gram of flour, "
                                               + this.sugar + " gram of sugar");
	}
        public void bake() {
		System.out.println("Baking the cake..");
		isBake = true;
	}
	
	public void changeTopping(String topping) {
		this.topping = topping;
		System.out.println("The topping is changed!");
	}
	
	public void showCake() {
		System.out.println("Cake flavor: " + flavor);
		System.out.println("Cake flour: " + flour + " gram");
		System.out.println("Cake sugar: " + sugar + " gram");
		System.out.println("Cake topping: " + topping);
		
		if(isBake) 
                {
                    System.out.println("The cake is already baked\n");
                }
		else 
                {
                    System.out.println("The cake has not been baked yet\n");
                }
	}
        
	public boolean isBake() {
		return isBake;
	}

}
