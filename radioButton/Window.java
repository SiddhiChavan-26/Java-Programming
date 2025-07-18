package college.dkte.p4;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame{
	
	JLabel labelGender;
	JRadioButton radioButtonMale;
	JRadioButton radioButtonFemale;
	ButtonGroup radiogroup;
	
	public Window() {
		this.setTitle("RadioButtons");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		labelGender = new JLabel("Gender: ");
		radioButtonMale = new JRadioButton("Male");
		radioButtonFemale = new JRadioButton("Female");
		
		labelGender.setBounds(50, 50, 80, 30);
		radioButtonMale.setBounds(140, 50, 80, 30);
		radioButtonFemale.setBounds(230, 50, 80, 30);
		
		radiogroup = new ButtonGroup();
		radiogroup.add(radioButtonMale);
		radiogroup.add(radioButtonFemale);
		
		this.add(labelGender);
		this.add(radioButtonMale);
		this.add(radioButtonFemale);
		
		radioButtonMale.addChangeListener( e -> {
			if(radioButtonMale.isSelected())
				System.out.println("Male is Selected");
		});
		
		radioButtonFemale.addChangeListener( e->{
			if(radioButtonFemale.isSelected())
				System.out.println("Female is selected.");
		});
	}
}
