package com.skilldistillery.entities;

public class FighterJet extends Jet implements GunRun {

	public FighterJet() {

	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);

	}

	@Override
	public String attack() {
		return " BBBBBBBBBBBBBBBBBBBBBBBBBBBRRRRRRRRRRRRRRRRRRRRRTTTTTTTTTTTTTTTTTTTTT";
	}

	@Override
	public String toString() {
		return "FighterJet  [  Model=" + getModel() + ", Speed=" + getSpeed() + " mph " + ", Range=" + getRange()
				+ ", Price=" + getPrice() + "]";
	}

	@Override
	public void fly() {

		double timeJetCanFly = ((getRange() / getSpeed()) * 60);
		int flightTime = (int) timeJetCanFly;
		System.out.println("FighterJet     model=" + getModel() + ", speed=" + getSpeed() + ", range=" + getRange() + ", price="
				+ getPrice() + ". This jet can fly for " + flightTime + " minutes");
		System.out.println("WWWWWWWWWWWOOOOOOOOOOOOSSSSSSSSSSSSHHHHHHHHH PEW PEW");
	}

}
