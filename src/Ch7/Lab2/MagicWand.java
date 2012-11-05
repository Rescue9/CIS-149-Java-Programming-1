/*
 * Program: MajgicWand.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Nov 5, 2012
 * Purpose: to Display a magic wand.
*/

package Ch7.Lab2;

import javax.swing.*;
import java.awt.*;

public class MagicWand extends JApplet{
	
	private static final long serialVersionUID = 1L; // eclipse complains
	
	public static final int XBASE = 100;
	public static final int YBASE = 100;
	public static final int POINT = 75;
	
	public static void drawStar(Graphics canvas){
		int xValue[] = new int[9];
		int yValue[] = new int[9];
		
		xValue[0] = XBASE;
		yValue[0] = YBASE - POINT;
		xValue[1] = XBASE+POINT/5;
		yValue[1] = YBASE - POINT/5;
		xValue[2] = XBASE+POINT;
		yValue[2] = YBASE;
		xValue[3] = XBASE+POINT/5;
		yValue[3] = YBASE + POINT/5;
		xValue[4] = XBASE;
		yValue[4] = YBASE + POINT;
		xValue[5] = XBASE-POINT/5;
		yValue[5] = YBASE + POINT/5;
		xValue[6] = XBASE-POINT;
		yValue[6] = YBASE;
		xValue[7] = XBASE-POINT/5;
		yValue[7] = YBASE - POINT/5;
		xValue[8] = XBASE;
		yValue[8] = YBASE - POINT;
		canvas.setColor(Color.YELLOW);
		canvas.fillPolygon(xValue, yValue, 9);
	}
	
	public static void drawWand(Graphics canvas){
		int xValue[] = new int[5];
		int yValue[] = new int[5];
		
		xValue[0] = XBASE-POINT/9;
		yValue[0] = YBASE;
		xValue[1] = XBASE+POINT/9;
		yValue[1] = YBASE;
		xValue[2] = XBASE+POINT/9;
		yValue[2] = YBASE + 3*POINT;
		xValue[3] = XBASE-POINT/9;
		yValue[3] = YBASE + 3*POINT;
		xValue[4] = XBASE-POINT/9;
		yValue[4] = YBASE;
		canvas.setColor(Color.BLUE);
		canvas.fillPolygon(xValue, yValue, 5);
	}
	
	public static void drawAura(Graphics canvas){
		
		int xValue[] = new int[3];
		int yValue[] = new int[3];
	
		xValue[0] = XBASE+4*POINT/10;
		yValue[0] = YBASE + 5*POINT/10;
		xValue[1] = XBASE+3*POINT/10;
		yValue[1] = YBASE + 3*POINT/10;
		xValue[2] = XBASE+5*POINT/10;
		yValue[2] = YBASE + 4*POINT/10;
	
		canvas.setColor(Color.RED);
		canvas.drawPolyline(xValue, yValue, 3);
		canvas.drawLine(XBASE+4*POINT/10, YBASE+4*POINT/10, XBASE+6*POINT/10, YBASE+6*POINT/10);
		
		xValue[0] = XBASE-4*POINT/10;
		yValue[0] = YBASE + 5*POINT/10;
		xValue[1] = XBASE-3*POINT/10;
		yValue[1] = YBASE + 3*POINT/10;
		xValue[2] = XBASE-5*POINT/10;
		yValue[2] = YBASE + 4*POINT/10;
	
		canvas.drawPolyline(xValue, yValue, 3);
		canvas.drawLine(XBASE-4*POINT/10, YBASE+4*POINT/10,	XBASE-6*POINT/10, YBASE+6*POINT/10);

		
		xValue[0] = XBASE+4*POINT/10;
		yValue[0] = YBASE - 5*POINT/10;
		xValue[1] = XBASE+3*POINT/10;
		yValue[1] = YBASE - 3*POINT/10;
		xValue[2] = XBASE+5*POINT/10;
		yValue[2] = YBASE - 4*POINT/10;

		canvas.drawPolyline(xValue, yValue, 3);
		canvas.drawLine(XBASE+4*POINT/10, YBASE-4*POINT/10, XBASE+6*POINT/10, YBASE-6*POINT/10);
		
		xValue[0] = XBASE-4*POINT/10;
		yValue[0] = YBASE - 5*POINT/10;
		xValue[1] = XBASE-3*POINT/10;
		yValue[1] = YBASE - 3*POINT/10;
		xValue[2] = XBASE-5*POINT/10;
		yValue[2] = YBASE - 4*POINT/10;
		
		canvas.drawPolyline(xValue, yValue, 3);
		canvas.drawLine(XBASE-4*POINT/10, YBASE-4*POINT/10,	XBASE-6*POINT/10, YBASE-6*POINT/10);
	}
	
	public void paint(Graphics canvas){
		setSize(200,400);
		drawWand(canvas);
		drawAura(canvas);
		drawStar(canvas);
	}
}
