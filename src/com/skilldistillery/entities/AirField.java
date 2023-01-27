package com.skilldistillery.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> jetsList = new ArrayList<>();
	private String jetsFile = "jets.txt";

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
//				System.out.println(jetType);

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
}
