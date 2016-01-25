package org.gpoint.tiere;

public class Cat extends Animal {
	
	protected String name;

	public Cat(String color, int countEyes, String name) {
		super(color, countEyes);
		this.name = name;
	}
	
	@Override
	public void walk() {
		System.out.println("Cat walks");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Cat makeNoise");
	}

}
