package Ch8.Lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CoderFrame extends JFrame implements ActionListener{

	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	
	private JButton encodeButton;
	private JButton decodeButton;
	private JButton shuffleButton;
	private JButton subButton;
	private JTextField keyTextField;
	private JTextField messageTextField;
	private JLabel outputLabel;
	
	private MessageEncoder encoder;
	private MessageDecoder decoder;
	
	public CoderFrame(){
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		encodeButton = new JButton("Encode");
		decodeButton = new JButton("Decode");
		shuffleButton = new JButton("Shuffle Code");
		subButton = new JButton("Substitution Code");
		
		encodeButton.addActionListener(this);
		decodeButton.addActionListener(this);
		shuffleButton.addActionListener(this);
		subButton.addActionListener(this);
		
		encoder = new SubstitutionCipher(5);
		decoder = new SubstitutionCipher(5);
		
		JLabel keyLabel = new JLabel("Enter an integer key here: ");
		keyTextField= new JTextField("5");
		messageTextField = new JTextField("Enter your message here");
		outputLabel = new JLabel("          ");
		
		setLayout(new FlowLayout());
		add(encodeButton);
		add(decodeButton);
		add(shuffleButton);
		add(subButton);
		
		add(keyLabel);
		add(keyTextField);
		
		add(messageTextField);
		add(outputLabel);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Encode")){
			String message = messageTextField.getText();
			outputLabel.setText(encoder.encode(message));
		}else if(e.getActionCommand().equals("Decode")){
			String message = messageTextField.getText();
			outputLabel.setText(decoder.decode(message));
		}else if(e.getActionCommand().equals("Shuffle Code")){
			String keyString = keyTextField.getText().trim();
			int key = Integer.parseInt(keyString);
			encoder = new ShuffleCipher(key);
			decoder = new ShuffleCipher(key);
		}else if(e.getActionCommand().equals("Substitution Code")){
			String keyString = keyTextField.getText().trim();
			int key = Integer.parseInt(keyString);
			encoder = new SubstitutionCipher(key);
			decoder = new SubstitutionCipher(key);
		}
		
	}
}
