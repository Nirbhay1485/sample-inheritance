package com.oca.example.git;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTests {

	@Test
	public void testBird() {
		Bird bird = new Bird();
		bird.sing();
		bird.fly();
		bird.sing();
		bird.walk();
	}

	@Test
	public void countANimals() {
		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Fish(), new Shark(), new Clownfish(), new Dolhpin(), new Frog(), new Dog(), new ButterFly(),
				new Cat() };

		CountingEnimals.countAnimals(animals);
		assertEquals(3, CountingEnimals.canFly);
		assertEquals(6, CountingEnimals.canSwim);
		assertEquals(8, CountingEnimals.canSing);
		assertEquals(7, CountingEnimals.canWalk);
	}

}
