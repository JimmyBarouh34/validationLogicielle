package org.ema.softquality.zoo;

import java.util.ArrayList;
import java.util.List;

import org.ema.softquality.animals.Animal;
import org.ema.softquality.animals.Chien;
import org.ema.softquality.animals.Lion;

public class Zoo {
	
	List<Animal> animals;
	
	List<Gardien> gardiens;
	

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Chien());
		animals.add(new Lion());
		
		List<Animal> animalsGardien = new ArrayList<Animal>();
		animals.add(new Chien());
		animals.add(new Lion());
		
		Gardien gardien1 = new Gardien();
		gardien1.setAnimals(animalsGardien);
		gardien1.recense(animalsGardien);
		
	} 

	public List<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	public List<Gardien> getGardiens() {
		return gardiens;
	}
	public void setGardiens(List<Gardien> gardiens) {
		this.gardiens = gardiens;
	}
	
}
