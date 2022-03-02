package com.bl.bsms;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	public void printBird(ArrayList<Bird> birdList) {
		for(Bird bird : birdList) {
			System.out.println("The list are :" + bird);
		}
	}
	
	public int showMainMenu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Main Menu");
		System.out.println("1.To add bird");
		System.out.println("2.To remove bird");
		System.out.println("3.To Update bird");
		System.out.println("4.To print all bird");
		System.out.println("5.To Exit Menu");
		
		int option = sc.nextInt();
		return option;
	}
}
