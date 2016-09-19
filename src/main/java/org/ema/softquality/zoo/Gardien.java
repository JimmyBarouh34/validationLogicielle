package org.ema.softquality.zoo;

import java.util.ArrayList;
import java.util.Collection;

import org.ema.softquality.animals.Animal;

public class Gardien {
	
	Collection<Animal> listeRef = new ArrayList<Animal>();
	
	
	public Collection<Animal> getAnimals() {
		return listeRef;
	}
	
	public void setAnimals(Collection<Animal> listeRef) {
		this.listeRef = listeRef;
	}
	
	void recense(Collection<Animal> listeRef){
		for (Animal animal : listeRef ){
			System.out.println(animal.crier());
		}
	}
}
