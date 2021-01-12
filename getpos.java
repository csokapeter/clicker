import java.awt.*;

public class getpos{
	public static void main(String[] args){

		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int x = (int) b.getX();
		int y = (int) b.getY();
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}
}