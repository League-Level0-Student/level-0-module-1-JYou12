package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		JOptionPane.showMessageDialog(null, "I am going to give you som riddles. \r\n Please awnser as best you can. \r\n (One Word Awnsers)");
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle1 = JOptionPane.showInputDialog("Who makes it, has no need of it.\r\n" + 
				"Who buys it, has no use for it. \r\n" + 
				"Who uses it can neither see nor feel it. \r\n" + 
				"What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle1.equalsIgnoreCase("coffin")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score += 1;
		}else{
			JOptionPane.showMessageDialog(null, "Wrong \r\n The awnser was coffin");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		String riddle2 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle2.equalsIgnoreCase("stamp")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score += 1;
		}else {
			JOptionPane.showMessageDialog(null, "Wrong \r\n The awnser was stamp");
		}
		
		String riddle3 = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle3.equalsIgnoreCase("candle")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score += 1;
		}else {
			JOptionPane.showMessageDialog(null, "Wrong \r\n The awnser was candle");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Good job you got " + score + " points!");
		
	}
}

