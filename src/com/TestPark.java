package com;

import com.park.Cat;
import com.park.Bird;
import com.park.Beetle;

public class TestPark {

	public static void main(String[] args) {
		
	   Cat sam = new Cat();
	   sam.gotoEat();
	   System.out.println("Сем кушает ?? - " + sam.isEat);
		   
	  
		Bird bird = new Bird();
		Beetle beetle1 = new Beetle();
		beetle1.weight = 6;
		
		Beetle beetle2 = new Beetle();
		beetle2.weight = 9;
		
		bird.catchBeetle(beetle1);
		bird.catchBeetle(beetle2);
		
		if(bird.isFat()){
		   System.out.println("Сыт");
		} else {
		       System.out.println("Ещё голоден");
		}
		
	}

}