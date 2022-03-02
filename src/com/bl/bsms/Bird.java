package com.bl.bsms;

public abstract class Bird {
	enum Color {GREEN,YELLOW,RED,BLUE,BLACK,WHITE,BLACK_WHITE}
	Color color;
	String name;
	
	abstract public void swim();
	abstract public void eat();
	abstract public void fly();
	
	@Override
	public String toString() {
		return "Bird [color=" + color + ", name=" + name + "]";
	}
	
}
