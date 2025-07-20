package college.dkte.p6;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Window extends JFrame{
	
	JList<String> listBox;
	JScrollPane scrollPane;
	
	public Window() {
		this.setTitle("ListBox");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		//model
		DefaultListModel<String> defaultListModel = new DefaultListModel<>();
		defaultListModel.addElement("Idli");
		defaultListModel.addElement("Vada");
		defaultListModel.addElement("Dosa");
		defaultListModel.addElement("Poha");
		defaultListModel.addElement("Upma");
		defaultListModel.addElement("Samosa");
		defaultListModel.addElement("Kachori");
		
		
		//view
		listBox = new JList<>(defaultListModel);
		
		scrollPane = new JScrollPane(listBox);
		scrollPane.setBounds(50, 50, 80, 80);
		this.add(scrollPane);
		
		//controller
		listBox.addListSelectionListener(e ->{
			if(e.getValueIsAdjusting())
				System.out.println(listBox.getSelectedValuesList());
		});
		
	}
}
