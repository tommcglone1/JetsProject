package com.skilldistillery.entities;

public class Transporter extends Jet implements LoadTroops{

	public Transporter() {
		
	}

	public Transporter(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void gearUp() {
		System.out.println("Green Light GO!");
	}

	@Override
	public String toString() {
		return "Transporter [  Model=" + getModel() + ", Speed="+ getSpeed() +" mph " + "SpeedInMach=" + 
	getSpeedInMach() + ", Range()=" + getRange() + ", Price()=" + getPrice() + "]";
	}
	
	

}
