package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String N = JOptionPane.showInputDialog(null, "How many nickels do you have");
		
int NN = Integer.parseInt(N);
		// Ask the user how many dimes they have, and convert their answer
String D = JOptionPane.showInputDialog(null, "How many dimes do you have");

int DD = Integer.parseInt(D);
		// Ask the user how many quarters they have, and convert their answer
String Q = JOptionPane.showInputDialog(null, "How many quarters do you have");

int QQ = Integer.parseInt(Q);
		// Calculate how much money the user has and save it in a double variable 
double A = NN * 5 + DD * 10 + QQ * 25;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have " + A + " Cents");
	}
}

