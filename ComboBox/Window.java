package college.dkte.p5;

import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Window extends JFrame{
	
	JComboBox<String> comboBox;
	
	public Window() {
		super("ComboBox");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		
		String[] arr = {"C", "CPP","JAVA","Python"};
		
		//model
		DefaultComboBoxModel<String> defaultComboBoxModel = new DefaultComboBoxModel<>(arr);
		
		
		//view
		comboBox = new JComboBox<>(defaultComboBoxModel);
		comboBox.setBounds(50, 50, 80, 30);
		this.add(comboBox);
		
		//Controller
		comboBox.addItemListener( e ->{
			System.out.println("Fav language: "+comboBox.getSelectedItem());;
		});
		
	}
}
