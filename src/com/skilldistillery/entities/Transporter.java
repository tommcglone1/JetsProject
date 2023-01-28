package com.skilldistillery.entities;

public class Transporter extends Jet implements LoadTroops {

	public Transporter() {

	}

	public Transporter(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String gearUp() {
		return "Load up into ";
	}

	@Override
	public String toString() {
		return "Transporter [  Model=" + getModel() + ", Speed=" + getSpeed() + " mph " + ", Range=" + getRange()
				+ ", Price=" + getPrice() + "]";
	}

	@Override
	public void fly() {

		double timeJetCanFly = ((getRange() / getSpeed()) * 60);
		int flightTime = (int) timeJetCanFly;
		System.out.println("Transporter    model=" + getModel() + ", speed=" + getSpeed() + ", range=" + getRange() + ", price="
				+ getPrice() + ". This jet can fly for " + flightTime + " minutes");
				System.out.println("WWWWOOOOOSSSSHHHH");
	}
}
