package com.skilldistillery.entities;

public class PassengerJet extends Jet{

	public PassengerJet() {
	}

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		
		double timeJetCanFly = ((getRange() / getSpeed()) * 60);
		int flightTime = (int) timeJetCanFly;
		System.out.println("PassengerJet   model=" + getModel() + ", speed=" + getSpeed() + ", range=" + getRange() + ", price="
				+ getPrice() + ". This jet can fly for " + flightTime + " minutes");
			System.out.println("WWWWWWWOOOOOOOOSSSSSSHHHHHHH");
	}

	
}
