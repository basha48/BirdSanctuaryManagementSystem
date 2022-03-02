package com.bl.bsms;

import com.bl.bsms.Bird.Color;

public class Penguin extends Bird{
	
	public Penguin() {
		color = Color.BLACK_WHITE;
		name = "penguin";
	}
	public void eat() {
		System.out.println("Penguin eats chilli");
	}
	
	public void swim() {
		System.out.println("Pengiun can swim");
	}

	@Override
	public void fly() {
	
	}
}
