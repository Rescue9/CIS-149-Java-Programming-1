package Ch1.Lab2;

import java.awt.*;
import javax.swing.*;

public class Icon extends JApplet{

	// added to supress warning:
	// the serializable class icon does not declare a static final serialVersionUID field of type long
	private static final long serialVersionUID = -6742476590203328679L;

	public void paint(Graphics g){
		
		g.drawOval(100, 100, 40, 40);
		g.fillOval(110, 110, 20, 20);
		g.drawArc(100, 140, 40, 40, 0, 180);
		g.drawArc(100, 60, 40, 40, 0, -180);
		g.drawArc(60, 100, 40, 40, 90, -180);
		g.drawArc(140, 100, 40, 40, 90, 180);

	}

}
