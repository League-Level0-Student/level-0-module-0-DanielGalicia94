package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class robot_graffiti {

	public static void main(String[] args) {
	Robot daniel = new Robot();
	daniel.setSpeed(7800);
	daniel.turn(-90);
	daniel.move(300);
	daniel.penDown();
	//the D
	daniel.turn(90);
	daniel.move(100);
	daniel.turn(90);
	int sides = 360;
	int angle = 360/sides;
	//the curve
	for (int i = 0; i < 180; i++) {
		daniel.move(2);
		daniel.turn(angle);
	}
	daniel.turn(90);
	daniel.move(150);
	daniel.penUp();
	daniel.turn(90);
	daniel.move(200);
	daniel.penDown();
	int side = 360;
	int angles = 360/side;
	//the curve
	for (int i = 0; i < 425; i++) {
		daniel.move(1);
		daniel.turn(angles);
	
	}
	daniel.move(100);
	}
}
