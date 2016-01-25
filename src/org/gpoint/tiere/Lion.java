package org.gpoint.tiere;

public class Lion extends Animal {

	public Lion(String color, int countEyes) {
		super(color, countEyes);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void walk() {
		System.out.println("Lion walks");
	}

	@Override
	public void makeNoise() {
		System.out.println("Lion makeNoise");
	}
	
	public void roar() {
		System.out.println("ROOOOAR");
	}
}
