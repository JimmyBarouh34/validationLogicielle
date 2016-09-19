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
		
		animals = new ArrayList<Animal>();
		animals.add(new Chien());
		animals.add(new Lion());
		
		listeRef = new ArrayList<Animal>();
		listeRef.add(new Chien());
		listeRef.add(new Lion());
		
		zoo.setAnimals(animals);
		gardien.setAnimals(listeRef);
	}

	@Test
	public void test() {
		assertEquals( zoo.getAnimals().size(), gardien.getAnimals().size());
	}
}
