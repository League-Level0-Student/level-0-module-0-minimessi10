import org.jointheleague.graphical.robot.Robot;

public class robotgraffiti {
	public static void main(String[] args) {
		Robot messi = new Robot();
		messi.penDown();
		messi.setSpeed(100);
		messi.move(200);
		messi.turn(90);
		for(int i=0;i<60;i++) {
			messi.move(5);
			messi.turn(3);
		}
		//messi.move(50);
		//messi.turn(30);
		//messi.move(50);
		//messi.turn(50);
		//messi.move(150);
		//for(int i=0;i<10;i++) {
			//messi.move(5);
			//messi.turn(3);
		//}
	}
}
