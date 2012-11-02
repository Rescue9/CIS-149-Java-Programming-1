/*
 * Program: LightApplet.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 31, 2012
 * Purpose: To turn on a yellow background when a button is pressed.
*/

package Ch6.Program2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class LightApplet extends JApplet implements ActionListener {
	
	
	private static final long serialVersionUID = 1L; // eclipse complains
	
	private Container contentPane;
	private JButton onOff;
	private boolean lightStatus;

	public void init(){
		
		contentPane = getContentPane();
		contentPane.setBackground(Color.gray);
		
		onOff = new JButton("On/Off");
		onOff.addActionListener(this);
		
		contentPane.setLayout(new BorderLayout());
		contentPane.add(onOff, BorderLayout.NORTH);
		lightStatus = false;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (!lightStatus){
			
			contentPane.setBackground(Color.yellow);
			lightStatus = true;
		} else {
			
			contentPane.setBackground(Color.gray);
			lightStatus = false;
		}
	}
	
	
}
