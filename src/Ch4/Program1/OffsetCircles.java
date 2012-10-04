/*
 * Program: OffsetCircles.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 4, 2012
 * Purpose: To display a set of offset circles with rotating colors of green, blue, and red. 
*/

package Ch4.Program1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class OffsetCircles extends JApplet {

	private static final long serialVersionUID = 1L; // eclipse complains
	
	//declare variables
	int drawNumber = 10;
	int radius = 25;
	int radiusDelta;
	int locationDelta;
	int currentLocation = 200;
	Color currentColor;
	Color colorRed = new Color(255,0,0);
	Color colorGreen =  new Color(0,255,0);
	Color colorBlue  = new Color(0,0,255);
	
	public void init(){
		
		// set the size of the window
		setSize(500,500);
		
		// get input
		// String drawNumberString = JOptionPane.showInputDialog("Enter the total number of circles you would like to draw: "); //commented out for correctness
		// String radiusString = JOptionPane.showInputDialog("Enter the radius of the first circle: "); //commented out for correctness
		String locationDeltaString = JOptionPane.showInputDialog("Enter the number of pixels each circle additional circle should be shifted right: ");
		String radiusDeltaString = JOptionPane.showInputDialog("Enter the change in radius each additional circle should have: \nThis MUST be larger than the pixel shift number!");
			
		// convert strings to int
		// drawNumber = Integer.parseInt(drawNumberString); //commented out for correctness
		// radius = Integer.parseInt(radiusString); //commented out for correctness
		radiusDelta = Integer.parseInt(radiusDeltaString);
		locationDelta = Integer.parseInt(locationDeltaString);
		
		//testing
		System.out.println(drawNumber);
		System.out.println(radius);
		System.out.println(radiusDelta);
		System.out.println(locationDelta);
	}
	
	public void drawCircle(Graphics g, int centerX, int centerY, int diameter, Color color){
		
		g.setColor(color);
		g.drawOval(centerX - radius, centerY - radius, radius*2, radius*2);
	}
	
	public void paint(Graphics g){
		
		for (int i=1; i<=drawNumber; i++){
			if (String.valueOf(currentColor).equals("java.awt.Color[r=255,g=0,b=0]")){
				currentColor = colorGreen;
			}else if (String.valueOf(currentColor).equals("java.awt.Color[r=0,g=255,b=0]")){
				currentColor = colorBlue;
			}else {
				currentColor = colorRed;
			}
			drawCircle(g, currentLocation, 200, radius, currentColor); currentLocation += locationDelta; radius += radiusDelta;
			System.out.println(currentColor);
		}
	}
}
