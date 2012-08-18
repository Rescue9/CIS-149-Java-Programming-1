package Ch1.Program2;

import java.awt.Graphics;
import javax.swing.JApplet;

public class Snowman extends JApplet{

	private static final long serialVersionUID = -8148186463293753109L;
	
	public void paint(Graphics canvas){
		
		// using setsize so that I'm not having to constantly resize
		// my Applet Viewer window!
		// TODO comment this out prior to submission!
		setSize(600,1000);
		
		// graphics code
		// body
		canvas.drawOval(125, 100, 200, 200);
		canvas.drawOval(75, 300, 300, 300);
		canvas.drawOval(25, 600, 400, 400);
		
		// face
		canvas.fillOval(190, 160, 10, 20);
		canvas.fillOval(257, 160, 10, 20);
		canvas.fillOval(225, 200, 10, 25);
		canvas.drawArc(180, 215, 100, 50, 180, 180);
		
		// buttons
		canvas.fillOval(225, 400, 15, 15);
		canvas.fillOval(225, 450, 15, 15);
		canvas.fillOval(225, 500, 15, 15);
		
		canvas.fillOval(225, 700, 15, 15);
		canvas.fillOval(225, 800, 15, 15);
		canvas.fillOval(225, 900, 15, 15);
		
		// hat
		canvas.fillRect(190, 25, 75, 50);
		canvas.fillRect(150, 75, 150, 35);
		
		// arm
		canvas.drawLine(325, 400, 450, 300);
		canvas.drawLine(450, 300, 425, 290);
		canvas.drawLine(450, 300, 450, 290);
		canvas.drawLine(450, 300, 475, 290);
		
		// sign
		canvas.drawRect(375, 140, 150, 150);
		canvas.drawString("Hello World!", 415, 200);		
	}

}
