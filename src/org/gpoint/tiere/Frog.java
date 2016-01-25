package org.gpoint.tiere;

public class Frog extends Animal {

	public Frog(String color, int countEyes) {
		super(color, countEyes);
	}
	
	@Override
	public void walk() {
		System.out.println("Frog walks");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Frog makeNoise");
	}

}
