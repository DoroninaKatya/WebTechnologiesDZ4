package com.park;

public class Bird {
	
	public int weight = 20;
	public int maxSpeed = 70;
	public double full = 20.4;
	public double fliesWeightAte = 0;
	
	public void hunt() {
		System.out.println("ôüþ ôüþ");
	}
	
	public void catchBeetle(Beetle beetle){
        fliesWeightAte += beetle.weight;
		}
		
		public boolean isFat(){
		    return fliesWeightAte > full;
			}

	
	
}
