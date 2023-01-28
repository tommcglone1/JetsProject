package com.skilldistillery.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	private List<Jet> jetsList = new ArrayList<>();
	private String jetsFile = "jets.txt";
	Scanner sc = new Scanner(System.in);

	public AirField() {
		populateAirField();
	}

	public List<Jet> populateAirField() {
		Jet j = null;

		try (BufferedReader bufIn = new BufferedReader(new FileReader(jetsFile))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetSpec = line.split(",");

				String jetType = jetSpec[0];
				String jetModel = jetSpec[1];
				String jetSpeed = jetSpec[2];
				String jetRange = jetSpec[3];
				String jetCost = jetSpec[4];

				if (jetType.equals("FighterJet")) {

					j = new FighterJet(jetModel, Double.parseDouble(jetSpeed), Integer.parseInt(jetRange),
							Long.parseLong(jetCost));
				} else {
					j = new Transporter(jetModel, Double.parseDouble(jetSpeed), Integer.parseInt(jetRange),
							Long.parseLong(jetCost));
				}
				jetsList.add(j);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return jetsList;
	}

	public void listFleet() {
		for (Jet listAllJets : jetsList) {
			System.out.println(listAllJets);
		}
	}

	public void flyAllJets() {
		for (Jet listAllJets : jetsList) {
			listAllJets.fly();
		}
	}

	public void getFastestJet() {
		double fastest = jetsList.get(0).getSpeed();
		int lastIndx = 0;
		for (int i = 0; i < jetsList.size(); i++) {
			if (jetsList.get(i).getSpeed() > fastest) {
				fastest = jetsList.get(i).getSpeed();
				lastIndx = i;
			}
		}
		System.out.println("The fastest Jet is " + jetsList.get(lastIndx));
	}

	public void getLongestRange() {
		int longest = jetsList.get(0).getRange();
		int lastIndx = 0;
		for (int i = 0; i < jetsList.size(); i++) {
			if (jetsList.get(i).getRange() > longest) {
				longest = jetsList.get(i).getRange();
				lastIndx = i;
			}
		}
		System.out.println("The jet with the longest range is " + jetsList.get(lastIndx));
	}

	public void loadUp() {
		for (Jet listAllJets : jetsList) {
			if (listAllJets instanceof Transporter) {
				System.out.println(((Transporter) listAllJets).gearUp() + listAllJets.toString());
			} 
		}
	}

	public void shoot() {
		for (Jet listAllJets : jetsList) {
			if (listAllJets instanceof FighterJet) {
				System.out.println(listAllJets.toString() + ((FighterJet) listAllJets).attack());
			} 
		}
	}

	public void addJetToFleet() {
		System.out.println("Please follow the instructions to enter" + 
							" the information for your new jet.");
		System.out.print("Enter the model of your jet:");
		String newJetModel = sc.nextLine();
		System.out.print("Enter the speed of your jet in MPH:");
		double newJetSpeed = sc.nextDouble();
		sc.nextLine();
		System.out.print("Please enter the range of your jet in miles:");
		int newJetRange = sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter the price of your jet in dollars:");
		long newJetPrice = sc.nextLong();
		sc.nextLine();

		PassengerJet newJet = new PassengerJet(newJetModel, newJetSpeed, newJetRange, newJetPrice);
		System.out.println("Here is your new Jet!" + " " + newJet);
		jetsList.add(newJet);
	}

	public void removeJet() {
		System.out.println("Select a numbered jet to remove");
		for (int i = 0; i < jetsList.size(); i++) {
			System.out.println(i + " " + jetsList.get(i));
		}
		int userInput = sc.nextInt();
		Jet removed = jetsList.remove(userInput);
		System.out.println("Goodbye, " + removed);

	}
}
