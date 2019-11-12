package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint {
	public static void main(String[] args) {
	String input =  JOptionPane.showInputDialog("What's your favorite color");
	JOptionPane.showMessageDialog(null, input + " is my favorite color too" );		
			
	Robot danny = new Robot();
	danny.penDown();
	danny.setSpeed(900);
	for (int i = 0; i < 3; i++) {
	danny.move(200);
	danny.turn(120);
	}}
}
