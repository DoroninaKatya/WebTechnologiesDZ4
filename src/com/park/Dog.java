package com.park;

public class Dog {

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
	
	public void gav(){
	  System.out.println("Гав");
	}
	
	public String getDescription (){
	  return "Пес " + feets + "лапы, " +  eyes + " глаза, " + tail + " хвост. Чтобы я гавкал вызовите метод gav () ";
	
	}
	
}