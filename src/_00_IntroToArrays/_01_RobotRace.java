package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		/*
		//2. create an array of 5 robots.
			Robot[] robots = new Robot[20];
		//3. use a for loop to initialize the robots.
			for(int i = 0; i < robots.length; i++) {
				robots[i] = new Robot();
				robots[i].miniaturize();
			//4. make each robot start at the bottom of the screen, side by side, facing up
				robots[i].setY(500);
				robots[i].setX(50*i + 60);
			}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.	
			boolean noWinner = true;
			int winnerNumber = 0;
			Random rand = new Random();
			while (noWinner) {
				for (int i = 0; i < robots.length; i++) {
					if (noWinner) {
						int random = rand.nextInt(50);
						robots[i].move(random);
					}
					if (robots[i].getY() < 10) {
						noWinner = false;
						winnerNumber = i;
					}
				}
			}

		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
			for (int i = 0; i < robots.length; i++) {
				if (i == winnerNumber) {
					robots[i].moveTo(450, 300);
				} else {
					robots[i].moveTo(50*i + 60, 500);
				}
			}
				robots[winnerNumber].expand();
				robots[winnerNumber].sparkle();
				for (int j = 0; j < 300; j++) {
					robots[winnerNumber].turn(j*3);
				}*/
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.			
			Robot artist2 = new Robot("batman");
			artist2.miniaturize();
			artist2.setSpeed(10000);
			artist2.sparkle();
			artist2.penDown();
			artist2.setRandomPenColor();
			artist2.moveTo(20, 300);
			for (int a = 0; a < 360; a++) {
				artist2.move(5);
				artist2.turn(1);
			}
		
			Robot[] robots2 = new Robot[5];
			for(int i = 0; i < robots2.length; i++) {
				robots2[i] = new Robot();
				robots2[i].miniaturize();
				robots2[i].setY(300);
				robots2[i].setX(45*i + 50);
				robots2[i].setSpeed(1000000);
			}
			
			boolean noCircleWinner = true;
			
			int circleWinner = 0;
			
			while (noCircleWinner) {
				for (int i = 0; i < robots2.length; i++) {
					if (noCircleWinner) {
						Random rand = new Random();
						int random = rand.nextInt(robots2.length * 2);
						robots2[i].turn(random);
						robots2[i].move(random);
					}
					if (robots2[i].getX() == (45*i + 50) && robots2[i].getY() == 305) {
						noCircleWinner = false;
						circleWinner = i;
					}
				}
			}
			
			for (int i = 0; i < robots2.length; i++) {
				if (i == circleWinner) {
					robots2[i].moveTo(450, 300);
				} else {
					robots2[i].moveTo(50*i + 60, 500);
				}
			}
				robots2[circleWinner].expand();
				robots2[circleWinner].sparkle();
				for (int j = 0; j < 300; j++) {
					robots2[circleWinner].turn(j*3);
				}
			
			/*for (int k = 0; k < robots2.length; k++) {
				for (int j = 0; j < 360; j++) {
					robots2[k].turn(1);
					robots2[k].move(k + 1);
				}
			}*/
	}
}
