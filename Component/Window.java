package college.dkte.p2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame{
	JButton submitButton;
	JButton cancelButton;
	
	
	public Window() {
		this.setTitle("Component");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		submitButton = new JButton("Submit");
		submitButton.setBounds(50, 50, 80, 30);
		this.add(submitButton);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(150, 50, 80, 30);
		this.add(cancelButton);
		
		submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Submit button clicked");
			}
		});
		
		cancelButton.addActionListener( e ->{
			System.out.println("Cancel button clicked!");
		});
		
	}
}
