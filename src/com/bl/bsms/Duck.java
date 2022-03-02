package com.bl.bsms;

public class Duck extends Bird{
	
	public Duck() {
		color = Color.RED;
		name = "duck";
	}
	public void eat() {
		System.out.println("Duck eats chilli");
	}
	
	public void fly() {
		System.out.println("Duck can fly");
	}
	
	public void swim() {
		System.out.println("Duck can swim");
	}
}
