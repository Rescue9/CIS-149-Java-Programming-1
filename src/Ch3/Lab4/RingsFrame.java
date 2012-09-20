package Ch3.Lab4;

/*
 * Program: RingsFrame.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: September 8, 2012
 * Purpose: To display Olympic rings
 */

import javax.swing.*;
import java.awt.*;

public class RingsFrame extends JFrame {
	
	// added to supress warning:
	// the serializable class icon does not declare a static final serialVersionUID field of type long
	private static final long serialVersionUID = 2077875058409763047L;

	public static final int RING_DIAMETER = 40;
	public static final int RING_X_OFFSET = 25;
	public static final int RING_Y_OFFSET = 25;
	
	public RingsFrame(){
		setBackground(Color.cyan);
	}
	
	public static void main(String[] args){
		RingsFrame frame = new RingsFrame();
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setTitle("Rings Frame, Chapter 3 Lab 4");
	}
	
	public void paint(Graphics canvas){
				
		canvas.setColor(Color.BLUE);
		canvas.drawOval(20, 50, RING_DIAMETER, RING_DIAMETER);
		
		canvas.setColor(Color.BLACK);
		canvas.drawOval(2*RING_X_OFFSET +20, 50, RING_DIAMETER, RING_DIAMETER);
		
		canvas.setColor(Color.RED);
		canvas.drawOval(4*RING_X_OFFSET +20, 50, RING_DIAMETER, RING_DIAMETER);
		
		canvas.setColor(Color.YELLOW);
		canvas.drawOval(RING_X_OFFSET +20, RING_Y_OFFSET + 50, RING_DIAMETER, RING_DIAMETER);
		
		canvas.setColor(Color.GREEN);
		canvas.drawOval(3*RING_X_OFFSET +20, RING_Y_OFFSET + 50, RING_DIAMETER, RING_DIAMETER);
		
		
	}

}
