package com.skilldistillery.entities;

public class FighterJet extends Jet implements GunRun{
	
	public FighterJet() {
		
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);

	}

	@Override
	public void attack() {
		System.out.println("BBBBBRRRRTTTTT");
	}

	@Override
	public String toString() {
		return "FighterJet [  Model=" + getModel() + ", Speed="+ getSpeed() +" mph " + "SpeedInMach=" + 
	getSpeedInMach() + ", Range()=" + getRange() + ", Price()=" + getPrice() + "]";
	}
	
	
	

}
