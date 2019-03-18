package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import java.util.Random;

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	static boolean superpower = true;
public static void main(String[] args) {
	while (superpower == true)
	{
	   
	
		// 1. Save the superpower for each person in a variable.
	int superpower = 1;
	Random rand = new Random();
	 int value = rand.nextInt(5); 
	 superpower = value;
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String name = JOptionPane.showInputDialog("Please enter a name.");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
	if(superpower == 0) {
		JOptionPane.showMessageDialog(null, name + "'s superpower flight");
	}else if(superpower == 1) {
		JOptionPane.showMessageDialog(null, name + "'s superpower speed");
	}else if(superpower == 2) {
		JOptionPane.showMessageDialog(null, name + "'s superpower lazer vision");
	}else if(superpower == 3) {
		JOptionPane.showMessageDialog(null, name + "'s superpower super strength");
	}else if(superpower == 4) {
		JOptionPane.showMessageDialog(null, name + "'s superpower is phasing");
	}
	}
}
}

