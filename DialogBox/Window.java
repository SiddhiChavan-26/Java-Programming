package college.dkte.dialogbox;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Window extends JFrame{
	
	public Window() {
		
		this.setTitle("Dialog box");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		showMessageDialogBox();
		showConfirmDialogBox();
		showInputDialogBox();
	}

	public void showMessageDialogBox() {
		JButton msgButton = new JButton("Show message");
		msgButton.setBounds(50,50,150,30);
		this.add(msgButton);
		msgButton.addActionListener(e -> {
			JOptionPane.showMessageDialog(Window.this, "Hello world");
		});
		
	}
	
	public void showConfirmDialogBox() {
		JButton confirmButton = new JButton("Confirm button");
		confirmButton.setBounds(50, 100, 150, 30);
		this.add(confirmButton);
		
		confirmButton.addActionListener(e ->{
			int selection = JOptionPane.showConfirmDialog(Window.this, "Are you sure you want to delete ?");
			if(selection == JOptionPane.YES_OPTION)
				System.out.println("Yes selected");
			else if (selection == JOptionPane.NO_OPTION)
				System.out.println("No selected");
			else if(selection == JOptionPane.CANCEL_OPTION)
				System.out.println("Cancel selected");
		});
	}
	
	public void showInputDialogBox() {
		JButton inputButton = new JButton("Input Button");
		inputButton.setBounds(50, 150, 150, 30);
		this.add(inputButton);
		
		inputButton.addActionListener(e ->{
			String name = JOptionPane.showInputDialog(Window.this, "Enter your name : ");
			System.out.println("Entered name : "+name);
		});
	}
}
