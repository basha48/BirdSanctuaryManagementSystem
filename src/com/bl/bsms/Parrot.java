package com.bl.bsms;

public class Parrot extends Bird {
	
	public Parrot() {
		color = Color.GREEN;
		name = "Parrot";
	}
	public void eat() {
		System.out.println("parrot eats mango");
	}
	
	public void fly() {
		System.out.println("parrot can fly");
	}

	@Override
	public void swim() {
	
	}
	
}
