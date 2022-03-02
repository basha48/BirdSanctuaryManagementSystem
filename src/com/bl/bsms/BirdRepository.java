package com.bl.bsms;

import java.util.ArrayList;

import com.bl.bsms.Bird.Color;

class BirdRepository {
	
	private ArrayList<Bird> birdList = new ArrayList<Bird>();
	
	public void add(Bird bird) {
		birdList.add(bird);
	}
	
	public void remove(Bird bird) {
		birdList.remove(bird);
	}
	
	public Bird getBird(String birdName) {
		for(Bird bird : birdList ) {
			if(birdName.equals(bird.name)) {
				return bird; 
			}
		}
		return null;
	}
	
	public void showAllBirds() {
		for(Bird bird : birdList ) {
			System.out.println(bird + " ");
		}
	}
	
}
