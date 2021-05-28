/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_christoperluisalexander;

/**
 *
 * @author ASUS
 */
public class Animal {
	private String gender;
	private String name;
        private String genus;
	private String mood;
        private int roamingtime;
	
	public Animal() {}
	
	public Animal(String gender, String name, String genus) {
		super();
		this.gender = gender;
		this.name = name;
                this.genus = genus;
	}

	public void makeSound() {
		System.out.println("animal: use growl!!");
	}
	
        public void makeSound1(){
                System.out.println("other animal: use growl!!");
        }
        
	public void selfComfort() {
		System.out.println("animal comforting themselves");
	}
	
	public void roam() {
		System.out.println("animal roams free");
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}
        
        public void setRoamingTime(int roaming){
                this.roamingtime = roaming;
        }
        
        public int getRoamingTime(){
                return roamingtime;
        }
        
        public String getGenus() {
		return genus;
	}
}

