package com.bl.bsms;

public class Ostrich extends Bird{
	
	public Ostrich() {
		color = Color.WHITE;
		name = "Ostrich";
	}
	
	public void eat() {
		System.out.println("Ostrich eats fruits");
	}

	@Override
	public void swim() {
		System.out.println("Ostrich can swim");
		
	}

	@Override
	public void fly() {
		System.out.println("Ostrich eats chilli");
		
	}
	
}
