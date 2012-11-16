/*
 * Program: PineTreeApplet.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Nov 15, 2012
 * Purpose: To display a green triangle and gray square that closely represents a pine tree.
*/

package Ch7.Program1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PineTreeGUI extends JFrame {

	private static final long serialVersionUID = 1L; // eclipse complains
	
	private static final int XBASE = 300;
	private static final int YBASE = 600;
	
	public static void main(String[] args){
		PineTreeGUI myTree = new PineTreeGUI();
		myTree.setSize(700, 700);
		myTree.setVisible(true);
	}
	
	public void paint(Graphics canvas){
		constructSquare(canvas);
		constructTriangle(canvas);
	}
	
	private void constructSquare(Graphics canvas){
		int[] xcoord = new int[4];
		int[] ycoord = new int[4];
		
		xcoord[0] = XBASE;
		ycoord[0] = YBASE;
		xcoord[1] = XBASE;
		ycoord[1] = YBASE - 100;
		xcoord[2] = XBASE + 100;
		ycoord[2] = YBASE - 100;
		xcoord[3] = XBASE + 100;
		ycoord[3] = YBASE;
		
		canvas.setColor(Color.GRAY);
		canvas.fillPolygon(xcoord, ycoord, 4);
	}
	
	private void constructTriangle(Graphics canvas){
		int[] xcoord = new int[3];
		int[] ycoord = new int[3];
		
		xcoord[0] = XBASE - 250;
		ycoord[0] = YBASE - 100;
		xcoord[1] = XBASE + 50;
		ycoord[1] = YBASE - 500;
		xcoord[2] = XBASE + 350;
		ycoord[2] = YBASE - 100;
		
		canvas.setColor(Color.GREEN);
		canvas.fillPolygon(xcoord, ycoord, 3);
	}
}