package com.park;

public class Cat {

	public String name;
	public String color;
	public boolean isEat = false;
	public int feets = 4, eyes = 2, tail = 1;

	
	public void setName (String name){
	 this.name = name;
	}

	public void setColor(String color) {
	this.color = color;
	}
	
	public void gotoEat(){
	  isEat = true;
	}
	 
	public void full(){
	  isEat = false;
	}
	
	public String getDescription (){
	  return "Кот " + feets + "лапы, " +  eyes + " глаза, " + tail + " хвост. ";
	
	}
	
}