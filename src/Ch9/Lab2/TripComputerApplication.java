package Ch9.Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TripComputerApplication extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L; // eclipse complains

	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	
	private TripComputer theComputer;
	
	public JLabel totalTimeLabel, timeLabel, distanceLabel, speedLabel;
	public JTextField distanceTextField, speedTextField, timeTextField;
	public JPanel buttonPanel, labelPanel, fieldPanel;
	public JButton stopButton, legButton;
	
	public TripComputerApplication(){
		setTitle("Trip Time Calculator");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout(10, 10));
		contentPane.setBackground(Color.GREEN);
		
		theComputer = new TripComputer();
		
		createLabels();
		createFields();
		createButtons();
		createPanels();
		
		contentPane.add(buttonPanel, BorderLayout.NORTH);
		contentPane.add(labelPanel, BorderLayout.WEST);
		contentPane.add(fieldPanel, BorderLayout.CENTER);
		contentPane.add(totalTimeLabel, BorderLayout.SOUTH);
	}
	
	public void createLabels(){
		timeLabel = new JLabel("Stop Time (hours)");
		distanceLabel = new JLabel("Distance (miles)");
		speedLabel = new JLabel("Speed (MPH)");
		totalTimeLabel = new JLabel("Your trip time so far (hours):");
	}
	
	public void createFields(){
		timeTextField = new JTextField();
		distanceTextField = new JTextField();
		speedTextField = new JTextField();
	}
	
	public void createButtons(){
		stopButton = new JButton("Add Stop");
		stopButton.addActionListener(this);
		
		legButton = new JButton("Add Leg");
		legButton.addActionListener(this);
	}
	
	public void createPanels(){
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.GREEN);
		
		labelPanel = new JPanel();
		labelPanel.setLayout(new GridLayout(3,1,0,10));
		labelPanel.setBackground(Color.GREEN);
		
		fieldPanel = new JPanel();
		fieldPanel.setLayout(new GridLayout(3, 1, 0, 10));
		fieldPanel.setBackground(Color.GREEN);
		
		buttonPanel.add(stopButton);
		buttonPanel.add(legButton);
		
		labelPanel.add(timeLabel);
		labelPanel.add(distanceLabel);
		labelPanel.add(speedLabel);
		
		fieldPanel.add(timeTextField);
		fieldPanel.add(distanceTextField);
		fieldPanel.add(speedTextField);
	}
	
	public void actionPerformed(ActionEvent e){
		String actionCommand = e.getActionCommand();
		
		if (actionCommand.equals("Add Leg")){
			try{
				double speed = Double.parseDouble(speedTextField.getText().trim());
				double distance = Double.parseDouble(distanceTextField.getText().trim());
				theComputer.computerLegTime(distance, speed);
				totalTimeLabel.setText("Your trip time so far (hours):" + theComputer.getTripTime());
			}
			catch(TripComputerException ex){
				totalTimeLabel.setText("Error: " + ex.getMessage());
			}
			catch(Exception ex){
				totalTimeLabel.setText("Error in speed or distance: " + ex.getMessage());
			}
		} 
		else if (actionCommand.equals("Add Stop")){		
			try{
				double time = Double.parseDouble(timeTextField.getText().trim());
				theComputer.takeRestStop(time);
				totalTimeLabel.setText("Your trip time so far (hours): " + theComputer.getTripTime());
			}
			catch (TripComputerException ex){
				totalTimeLabel.setText("Error: " + ex.getMessage());
			}
			catch (Exception ex){
				totalTimeLabel.setText("Error in time: " + ex.getMessage());
			}
		}
		else {
			System.out.println("Error in button interface.");
		}
	}
	
	public static void main(String[] args){
		TripComputerApplication gui = new TripComputerApplication();
		gui.setVisible(true);
	}
}
