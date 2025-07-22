package college.dkte.p3;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Window extends JFrame{
	
	JLabel labelName;
	JTextField textName;
	JButton saveButton;
	
	public Window() {
		this.setTitle("Label and TextField");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		labelName = new JLabel("Name : ");
		textName = new JTextField();
		
		labelName.setBounds(50, 50, 80, 30);
		textName.setBounds(130, 50, 100, 30);
		
		this.add(labelName);
		this.add(textName);
		
		saveButton = new JButton("Save");
		saveButton.setBounds(100, 100, 100, 30);
		this.add(saveButton);
		
		saveButton.addActionListener(e -> {
			System.out.println("Name: "+textName.getText());
			textName.setText(" ");
		});
		
	}
}
