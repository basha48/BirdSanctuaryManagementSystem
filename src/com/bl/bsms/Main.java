package com.bl.bsms;

import java.util.ArrayList;
import java.util.Scanner;

import com.bl.bsms.Bird.Color;

public class Main {
	BirdRepository birdRepository = new BirdRepository();
	public static void main(String[] args) {
		Main main = new Main();
		UserInterface ui = new UserInterface();
		int option = 0; 
	   while(option != 5) {
		   option = ui.showMainMenu();
		   main.handleUserSelect(option);
	   }
	   System.out.println("bye to every one");
	}

	public void handleUserSelect(int option) {
		switch(option) {
		case 1:
			addBird();
			break;
		case 2:
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name of the bird");
			String name =sc.nextLine();
			Bird getbird = birdRepository.getBird(name);
			birdRepository.remove(getbird);
			break;
		case 3:
			break;
		case 4:
			birdRepository.showAllBirds();
			break;
		case 5:
			break;
			default:
				System.out.println("choose correct option");
				
		}
	}
	
	public void addBird() {
		
		Parrot parrot = new Parrot();
		Penguin penguin = new Penguin();
		Duck duck = new Duck();
		Ostrich ostrich = new Ostrich();
		birdRepository.add(parrot);
		birdRepository.add(duck);
		birdRepository.add(penguin);
		birdRepository.add(ostrich);
		System.out.println("bird added sucessfully");

	}
	
}
