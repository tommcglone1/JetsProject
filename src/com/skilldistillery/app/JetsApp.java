package com.skilldistillery.app;

import java.util.Scanner;

import com.skilldistillery.entities.AirField;

public class JetsApp {

	private AirField bagram = new AirField();
	Scanner sc = new Scanner(System.in);

	public JetsApp() {

	}

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.run();

	}

	public void run() {
		userSelection();
	}

	public void userSelection() {

		boolean usingMenu = true;
		int inputInt = 0;

		while (usingMenu) {

			displayUserMenu();
			inputInt = sc.nextInt();
			sc.nextLine();

			switch (inputInt) {
			case 1:
				bagram.listFleet();
				break;
			case 2:
				bagram.flyAllJets();
				break;
			case 3:
				bagram.getFastestJet();
				break;
			case 4:
				bagram.getLongestRange();
				break;
			case 5:
				bagram.loadUp();
				break;
			case 6:
				bagram.shoot();
				break;
			case 7:
				bagram.addJetToFleet();
				break;
			case 8:
				bagram.removeJet();
				break;
			case 9:
				System.out.println("Thank you, goodbye");
				usingMenu = false;
				break;
			default:
				System.out.println("That is not a valid selection");
				break;

			}
		}
	}

	public void displayUserMenu() {

		System.out.println("---------Please select a numbered option----------");
		System.out.println("|               1.List the Fleet                 |");
		System.out.println("|               2.Fly all Jets                   |");
		System.out.println("|             3.View Fastest Jet                 |");
		System.out.println("|        4.View Jet with the longest range       |");
		System.out.println("|               5.Load troops                    |");
		System.out.println("|             6.Perform Gun Run                  |");
		System.out.println("|          7.Add a jet to the fleet              |");
		System.out.println("|        8.Revome a jet from the fleet           |");
		System.out.println("|                  9.Quit                        |");
		System.out.println("--------------------------------------------------");

	}
}
