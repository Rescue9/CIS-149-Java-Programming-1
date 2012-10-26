/*
 * Program: MonkeyFaces.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 9, 2012
 * Purpose: See no Elvis, Hear no Elvis, Speak no Elvis.....
*/

package Ch5.Lab3;

import javax.swing.JApplet;
import java.awt.*;

enum HandPosition {EAR, EYE, MOUTH};


public class MonkeyFaces extends JApplet{

	private static final long serialVersionUID = 1L;  // eclipse complains...
	
	static final int XBASE = 100;
	static final int YBASE = 100;
	static final int FACE_DIAMETER = 75;
	static final int FACE_SPACING = 150;
	
	public static void drawFace(Graphics canvas, int atX, int atY, HandPosition where){
		
		int earWidth, earHeight, earOffset, eyeWidth, eyeHeight, eyeOffsetX, eyeOffsetY,
		mouthWidth, mouthHeight, mouthOffsetX, mouthOffsetY, handOffsetX, handOffsetY;
		
		canvas.drawOval(atX-FACE_DIAMETER/2, atY-FACE_DIAMETER/2, FACE_DIAMETER, FACE_DIAMETER);
		
		// draw the ears
		earWidth = (int) (FACE_DIAMETER * 0.3);
		earHeight = (int) (FACE_DIAMETER * 0.5);
		earOffset = (int) (FACE_DIAMETER *0.06);
		canvas.drawOval(atX-FACE_DIAMETER/2-earWidth+earOffset, atY-FACE_DIAMETER/2, earWidth, earHeight);
		canvas.drawOval(atX+FACE_DIAMETER/2-earOffset, atY-FACE_DIAMETER/2, earWidth, earHeight);
		
		// draw the eyes
		eyeWidth = (int)(FACE_DIAMETER * 0.15);
		eyeHeight = (int) (FACE_DIAMETER * 0.25);
		eyeOffsetX = (int) (FACE_DIAMETER * 0.40);
		eyeOffsetY = (int) (FACE_DIAMETER * 0.20);
		canvas.fillOval(atX-FACE_DIAMETER/2-eyeWidth+eyeOffsetX, atY-FACE_DIAMETER/2+eyeOffsetY, eyeWidth, eyeHeight);
		canvas.fillOval(atX+FACE_DIAMETER/2-eyeOffsetX, atY-FACE_DIAMETER/2+eyeOffsetY, eyeWidth, eyeHeight);
		
		// draw mouth
		mouthWidth = (int) (FACE_DIAMETER * 0.70);
		mouthHeight = (int) (FACE_DIAMETER * 0.60);
		mouthOffsetX = (int) (FACE_DIAMETER * 0.06);
		mouthOffsetY = (int) (FACE_DIAMETER * 0.25);
		canvas.drawArc(atX-mouthWidth/2+mouthOffsetX, atY-FACE_DIAMETER/2+mouthOffsetY, mouthWidth, mouthHeight, 0, -180);
		
		switch (where){
		
		case MOUTH:
			handOffsetX = (int) (mouthWidth * 0.3);
			handOffsetY = (int) (-FACE_DIAMETER/2+mouthOffsetY+mouthHeight*0.9);
			drawHand(canvas, atX-handOffsetX, atY+handOffsetY);
			drawHand(canvas, atX+handOffsetX, atY+handOffsetY);
			break;
			
		case EYE:
			handOffsetX = (int) (eyeOffsetX-eyeWidth);
			handOffsetY = (int) (-FACE_DIAMETER/2+eyeOffsetY+eyeHeight*0.6);
			drawHand(canvas, atX-handOffsetX, atY+handOffsetY);
			drawHand(canvas, atX+handOffsetX, atY+handOffsetY);
			break;
			
		case EAR:
			handOffsetX = (int) (-FACE_DIAMETER/2-earWidth/2);
			handOffsetY = (int) (-FACE_DIAMETER/2+earHeight*0.75);
			drawHand(canvas, atX-handOffsetX, atY+handOffsetY);
			drawHand(canvas, atX+handOffsetX, atY+handOffsetY);
			break;
		}
	}
	
	public static void drawHand(Graphics canvas, int atX, int atY){
		
		int palmWidth, palmHeight, fingerWidth, fingerHeight, fingerOffsetX, fingerOffsetY;
		
		palmWidth = (int) (FACE_DIAMETER * 0.4);
		palmHeight = (int) (FACE_DIAMETER * 0.2);
		
		canvas.fillOval(atX-palmWidth/2, atY-palmHeight/2, palmWidth, palmHeight);
		
		// draw the fingers
		fingerWidth = (int) (palmWidth * 0.2);
		fingerHeight = (int) (palmHeight * 1.2);
		fingerOffsetX = (int) (fingerWidth * 0.8);
		fingerOffsetY = (int) (fingerHeight * 0.8);
		
		canvas.fillOval(atX-fingerWidth/2-fingerOffsetX, atY-palmHeight/2-fingerOffsetY, fingerWidth, fingerHeight);
		canvas.fillOval(atX-fingerWidth/2, atY-palmHeight/2-fingerOffsetY, fingerWidth, fingerHeight);
		canvas.fillOval(atX-fingerWidth/2+fingerOffsetX, atY-palmHeight/2-fingerOffsetY, fingerWidth, fingerHeight);
	}
	
	public void paint(Graphics canvas){
		
		setSize(500,300);
		drawFace(canvas, XBASE, YBASE, HandPosition.EAR);
		
		canvas.drawString("Hear no evil", XBASE-FACE_DIAMETER/2, YBASE+FACE_DIAMETER);
		
		drawFace(canvas, XBASE+FACE_SPACING, YBASE, HandPosition.EYE);
		
		canvas.drawString("See no evil", XBASE+FACE_SPACING-FACE_DIAMETER/2, YBASE+FACE_DIAMETER);
		
		drawFace(canvas, XBASE+2*FACE_SPACING, YBASE, HandPosition.MOUTH);
		
		canvas.drawString("Speak no evil", XBASE+2*FACE_SPACING-FACE_DIAMETER/2, YBASE+FACE_DIAMETER);
	}

}
