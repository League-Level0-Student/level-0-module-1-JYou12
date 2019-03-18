package ifs_ints_and_loops;
import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	
	String birthday = JOptionPane.showInputDialog("What is your birthday. mm/dd");
	if (birthday.equalsIgnoreCase("03/04")) {
JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY!!!!!!!!!!!!!!!!!!!!!!!!!");
	}else{
		JOptionPane.showMessageDialog(null, "Happy Unbirthday");

	}
	
}
}
