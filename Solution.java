package com.oca.example.git;

interface Swiming {
	public void swim();
}

interface Singing {
	public void sing();
}

interface Flying {
	public void fly();
}

interface Walking {
	public void walk();
}

abstract class Animal {
}

abstract class Birds extends Animal implements Walking {

	@Override
	public void walk() {
		System.out.println("Im walking");
	}

}

class Bird extends Birds implements Singing, Flying {

	@Override
	public void sing() {
		System.out.println("Im singing");

	}

	public void fly() {

		System.out.println("Im flying");

	}

}

class Duck extends Birds implements Swiming, Singing {

	@Override
	public void sing() {
		System.out.println("Quack, quack");

	}

	@Override
	public void swim() {
		System.out.println("A duck can swim");

	}

}

class Chicken extends Birds implements Singing {
	String sound = "Cluck, cluck";

	@Override
	public void sing() {
		System.out.println(sound);

	}

	public void setSound(String sound) {
		this.sound = sound;
	}

}

class Rooster extends Animal {
	Chicken getRooster() {
		Chicken ch = new Chicken();
		ch.sound = "Cock-a-doodle-doo";
		return ch;

	}

}

class Parrot extends Bird {

	@Override
	public void sing() {
		System.out.println("Parent can sing");

	}

}

class ParrotWithDogs extends Parrot {

	@Override
	public void sing() {
		System.out.println("Woof, woof");
	}
}

class ParrotWithCat extends Parrot {
	@Override
	public void sing() {
		System.out.println("Meow");
	}
}

class ParrotWithRooster extends Parrot {
	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
}

// B part
class Fish extends Animal implements Swiming {

	private String swim = "Fish can swim";

	@Override
	public void swim() {
		System.out.println(swim);

	}

	Fish() {

	}

	Fish(String swim) {
		this.swim = swim;
	}

}

class Shark extends Fish {
	private String size;
	private String color;
	private String food;

	public Shark() {
		size = "large";
		color = "grey";
		food = "other fish";
	}

	@Override
	public String toString() {

		return size + ", " + color + ", " + food;
	}
}

class Clownfish extends Fish {
	private String size;
	private String color;
	private String make;

	public Clownfish() {
		size = "small";
		color = "orange";
		make = "Make jokes";
	}

	@Override
	public String toString() {

		return size + ", " + color + ", " + make;
	}
}

class Dolhpin extends Animal {

	void getDolphins() {
		new Fish("Dolphins are good swimmers.").swim();
	}

}

/// C
class ButterFly extends Animal implements Flying {

	@Override
	public void fly() {
		System.out.println("Butter fly can fly...");

	}

}

class Caterpillar extends Animal implements Walking {

	@Override
	public void walk() {
		System.out.println("A caterpillar cannot fly");

	}

}

class Frog extends Animal implements Singing, Swiming, Walking {

	@Override
	public void sing() {
		System.out.println("Frog can sing");
	}

	@Override
	public void swim() {
		System.out.println("Frog can swim");

	}

	@Override
	public void walk() {
		System.out.println("Frog can walk");

	}

}

class Dog extends Animal implements Singing, Walking {

	@Override
	public void walk() {
		System.out.println("Dog can walk.");

	}

	@Override
	public void sing() {
		System.out.println("Dog can bark.");

	}

}

class Cat extends Animal implements Singing, Walking {

	@Override
	public void walk() {
		System.out.println("Dog can walk.");

	}

	@Override
	public void sing() {
		System.out.println("Cat can meow.");

	}

}

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

		Duck duck = new Duck();
		duck.sing();
		duck.swim();

		Chicken chicken = new Chicken();
		chicken.sing();

		Dolhpin dl = new Dolhpin();
		dl.getDolphins();

		ButterFly fly = new ButterFly();
		fly.fly();
		
		//E Counting Animals
		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Fish(), new Shark(), new Clownfish(), new Dolhpin(), new Frog(), new Dog(), new ButterFly(),
				new Cat() };


		CountingEnimals.countAnimals(animals);
		System.out.println("How many animals can Fly: " + CountingEnimals.canFly);
		System.out.println("How many animals can Swim: " + CountingEnimals.canSwim);
		System.out.println("How many animals can Sing: " + CountingEnimals.canSing);
		System.out.println("How many animals can Walk: " + CountingEnimals.canWalk);

	}
}

class CountingEnimals {
	// E Counting Animals
	public static int canFly = 0, canSwim = 0, canSing = 0, canWalk = 0;
	
	public static void countAnimals(final Animal [] animals) {
		for (Animal animal : animals) {

			if (animal instanceof Singing || animal instanceof Rooster) {

				canSing++;
			}
			if (animal instanceof Walking) {
				canWalk++;
			}

			if (animal instanceof Swiming || animal instanceof Dolhpin) {

				canSwim++;
			}
			if (animal instanceof Flying) {
				canFly++;
			}

		}
	}

}
