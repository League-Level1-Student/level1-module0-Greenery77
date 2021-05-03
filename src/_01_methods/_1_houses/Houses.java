package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {

	static Robot rob = new Robot();

	public void run() {
		// Check the recipe to find out what code to put here

		Random ran = new Random();

		rob.moveTo(30, 500);
		rob.setAngle(0);
		rob.penDown();
		rob.setSpeed(90);
		rob.hide();

		for (int i = 0; i < 10; i++) {

			String size = "";
			int random = ran.nextInt(3);
			if (random == 0) {
				size = "Small";
			}
			if (random == 1) {
				size = "Medium";
			}
			if (random == 2) {
				size = "Large";
			}
			
			random = ran.nextInt(3);
			
			String color = "";
			if (random == 0) {
				color = "Red";
			}
			if (random == 1) {
				color = "Yellow";
			}
			if (random == 2) {
				color = "Blue";
			}
			drawHouse(size, color);

		}

	}

	static void drawHouse(String size, String color) {

		int height = 0;
		Color houseColor = Color.BLACK;

		if (size.equals("Small")) {
			height = 100;
		}
		if (size.equals("Medium")) {
			height = 150;
		}
		if (size.equals("Large")) {
			height = 200;
		}
		if (color.equals("Red")) {
			houseColor = Color.RED;
		}
		if (color.equals("Yellow")) {
			houseColor = Color.YELLOW;
		}
		if (color.equals("Blue")) {
			houseColor = Color.blue;
		}
		
		rob.setPenColor(houseColor);
		rob.move(height);
		
		if (height>=151) {
			
			drawFlatRoof(houseColor);
			
		}
		else if (height<=150) {
			
			drawPointedRoof(houseColor);
		
		}
			
			rob.move(height);
			rob.setPenColor(0, 200, 100);
			rob.turn(-90);
			rob.move(30);
			rob.setAngle(0);
		
	}
	
	static void drawFlatRoof(Color houseColor) {

		rob.turn(90);
		rob.move(50);
		rob.turn(90);
	
	}
	
	static void drawPointedRoof(Color houseColor) {
		
		rob.setPenColor(houseColor);
		rob.setAngle(45);
		rob.move(30);
		rob.setAngle(135);
		rob.move(30);
		rob.setAngle(180);
	}
	

}
