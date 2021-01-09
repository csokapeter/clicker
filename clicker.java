import java.awt.event.*;
import java.awt.Robot;


public class clicker{

	public static void pihi(int x){

		try{
			Thread.sleep(x);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}

	}

	public static void main(String args[]) {

	Robot bot = null;

	try {
		bot = new Robot();
	}catch(Exception failed){
		System.err.println("Failed instantiating Robot: " + failed);
	}

	int mask = InputEvent.BUTTON1_DOWN_MASK;

	bot.mouseMove(1200, 300);
	bot.mousePress(mask);
	bot.mouseRelease(mask);
	pihi(100);

	bot.mouseMove(1500, 300);
	bot.mousePress(mask);
	bot.mouseRelease(mask);
	pihi(100);

	bot.mouseMove(1700, 300);
	bot.mousePress(mask);
	bot.mouseRelease(mask);
	pihi(100);

	bot.mouseMove(1200, 400);
	bot.mousePress(mask);
	bot.mouseRelease(mask);
	pihi(100);

	}
}