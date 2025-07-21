package college.dkte.p7;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Window extends JFrame{
	
	JTable productTable;
	JScrollPane scrollPane;
	
	public Window() {
		this.setTitle("Table");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		Object[] colNames = {"pid","pname","price"};
		//model
		
		DefaultTableModel defaultTableModel = new DefaultTableModel (colNames, 0);
		defaultTableModel.addRow(new Object[] { 1, "Pen", 15 });
		defaultTableModel.addRow(new Object[] { 2, "Pencil", 5 });
		defaultTableModel.addRow(new Object[] { 3, "Book", 50 });
		defaultTableModel.addRow(new Object[] { 4, "Eraser", 3 });
		defaultTableModel.addRow(new Object[] { 5, "Ruler", 12 });
		
		//view
		productTable = new JTable(defaultTableModel);
		
		scrollPane = new JScrollPane(productTable);
		scrollPane.setBounds(50, 50, 200, 200);
		this.add(scrollPane);
		
		//controller
		ListSelectionModel listSelectionModel = productTable.getSelectionModel();
		listSelectionModel.addListSelectionListener(e -> {
			if (e.getValueIsAdjusting()) {
				int row = productTable.getSelectedRow();
				System.out.println("row selected - " + row);
				System.out.println("Pid - " + productTable.getValueAt(row, 0));
				System.out.println("Pname - " + productTable.getValueAt(row, 1));
				System.out.println("Price - " + productTable.getValueAt(row, 2));
			}
		});
	}
}
