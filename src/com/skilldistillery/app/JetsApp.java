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
		displayUserMenu();
	}

	public void displayUserMenu() {
		
	}
	
}
