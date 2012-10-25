/*
 * Program: BackgroundApplet.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 23, 2012
 * Purpose: Undetermined as of yet. //TODO
*/

package Ch6.Lab3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BackgroundApplet extends JApplet implements ActionListener {
	
	private static final long serialVersionUID = 1L; // eclipse complains
	
	private Container contentPane;
	private JButton redButton, whiteButton, blueButton;
	private JLabel instructions;
	
	public void init(){
		
		contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		
		// program buttons:
		redButton = new JButton("Red");
		redButton.addActionListener(this);
		
		whiteButton = new JButton("White");
		whiteButton.addActionListener(this);
		
		blueButton = new JButton("Blue");
		blueButton.addActionListener(this);
		
		// program label:
		instructions = new JLabel("Click a button to change the background color.");
		
		// add buttons:
		contentPane.setLayout(new FlowLayout());
		contentPane.add(redButton);
		contentPane.add(whiteButton);
		contentPane.add(blueButton);
		
		// add label:
		contentPane.add(instructions);
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals("Red")){
			contentPane.setBackground(Color.RED);
			instructions.setForeground(Color.WHITE);
		}
		else if (e.getActionCommand().equals("White")) {
			contentPane.setBackground(Color.WHITE);
			instructions.setForeground(Color.BLUE);
		}
		else if (e.getActionCommand().equals("Blue")) {
			contentPane.setBackground(Color.BLUE);
			instructions.setForeground(Color.RED);
		}
		else
			System.out.println("Error in button interface.");
	}

}
