package Ch4.Lab4;
/*
 * Program: BullseyeApplet.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Sep 22, 2012
 * Purpose: To disable a bullseye in an applet, then application
*/

import java.awt.*;
import javax.swing.JApplet;

public class BullseyeApplet extends JApplet {

	private static final long serialVersionUID = 1L; // eclipse complains

	public void drawCircle(Graphics g, int centerX, int centerY, int diameter, Color color){
		g.setColor(color);
		g.fillOval(centerX - diameter / 2, centerY - diameter /2, diameter, diameter); //Changed due to fillCircle being 'undefined'
	}
	
	public void paint(Graphics g){
		{
			drawCircle(g, 100, 100, 175, Color.GREEN); // Changed due to MAUVE not being recognized
			drawCircle(g, 100, 100, 150, Color.BLUE);
			drawCircle(g, 100, 100, 125, Color.GREEN);
			drawCircle(g, 100, 100, 100, Color.BLUE);
			drawCircle(g, 100, 100, 75, Color.GREEN);
			drawCircle(g, 100, 100, 50, Color.BLUE);
			}

	}
	
}
