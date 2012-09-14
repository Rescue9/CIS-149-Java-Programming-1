package Ch3.Lab4;

/*
 * Program: Rings.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: September 8, 2012
 * Purpose: To display Olympic rings
 */

import javax.swing.*;
import java.awt.*;

public class Rings extends JApplet{
	
	// added to supress warning:
	// the serializable class icon does not declare a static final serialVersionUID field of type long
	private static final long serialVersionUID = 5302949132430816477L;

	public static final int RING_DIAMETER = 40;
	public static final int RING_X_OFFSET = 25;
	public static final int RING_Y_OFFSET = 25;
	
	public static void main(String[] args){
		
	}
	
	public void paint(Graphics canvas){
		
		canvas.setColor(Color.BLUE);
		canvas.drawOval(0, 0, RING_DIAMETER, RING_DIAMETER);
		
		canvas.setColor(Color.BLACK);
		canvas.drawOval(2*RING_X_OFFSET, 0, RING_DIAMETER, RING_DIAMETER);
		
		canvas.setColor(Color.RED);
		canvas.drawOval(4*RING_X_OFFSET, 0, RING_DIAMETER, RING_DIAMETER);
		
		canvas.setColor(Color.YELLOW);
		canvas.drawOval(RING_X_OFFSET, RING_Y_OFFSET, RING_DIAMETER, RING_DIAMETER);
		
		canvas.setColor(Color.GREEN);
		canvas.drawOval(3*RING_X_OFFSET, RING_Y_OFFSET, RING_DIAMETER, RING_DIAMETER);
		
		
	}

}
