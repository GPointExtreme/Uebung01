package org.gpoint.tiere;

public class Animal {
	
	protected String color;
	protected int countEyes;
	
	public Animal(String color, int countEyes) {
		super();
		this.color = color;
		this.countEyes = countEyes;
	}

	public void walk() {
		System.out.println("walk");
	}
	
	public void makeNoise() {
		System.out.println("makeNoise");
	}

}
