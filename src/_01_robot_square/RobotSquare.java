package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot messi=new Robot();

        // 3. Put the robot's pen down
messi.penDown();

        // 6. Make the robot move as fast as possible
messi.setSpeed(100);

        // 5. Do everything below here 4 times


        //         2. Move your robot 200 pixels

        //         4. Turn the robot 90 degrees to the right (90 degrees)



int  messi2=2;
 while(messi2<6) {
messi.turn(90);
messi.move(200);
messi2=1+messi2;





    }
    }
}
