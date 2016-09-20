package org.ema.softquality;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.ema.softquality.animals.Animal;
import org.ema.softquality.animals.Chien;
import org.ema.softquality.animals.Lion;
import org.ema.softquality.zoo.Gardien;
import org.ema.softquality.zoo.Zoo;
import org.junit.Before;
import org.junit.Test;

public class ZooTest {

	Zoo zoo;
	Gardien gardien;
	List<Animal> animals;
	List<Animal> listeRef;
	
	@Before
	public void setUp() throws Exception {
		zoo = new Zoo();
		gardien = new Gardien();
		
		animals = new ArrayList<>();
		animals.add(new Chien("doggo", "wouaf"));
		animals.add(new Lion("simbad", "wouarg"));
		
		listeRef = new ArrayList<>();
		listeRef.add(new Chien("doggo", "wouaf"));
		listeRef.add(new Lion("simbad", "wouarg"));
		
		zoo.setAnimals(animals);
		gardien.setAnimals(listeRef);
	}

	@Test
	public void testNbElemInList() {
		assertEquals( zoo.getAnimals().size(), gardien.getAnimals().size());
	}
}
