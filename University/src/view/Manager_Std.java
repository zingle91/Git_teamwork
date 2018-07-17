package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Manager_Std extends JPanel {
	private JPanel ManagerPanel;
	private JTable table;
	private JTextField tfNum;
	private JTextField tfName;
	private JTextField tfcollege;
	private JTextField tfmajor;
	JButton b_register, b_update, b_delete;

	/**
	 * Create the panel.
	 */
	public Manager_Std() {
		
	
		
		JPanel std = new JPanel();
		std.setLayout(new BorderLayout(0, 0));
		
		JPanel p1 = new JPanel();
		std.add(p1, BorderLayout.CENTER);
		p1.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		table.setBorder(new TitledBorder(null, "\uD559\uC0DD", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		p1.add(table, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\uAD00\uB9AC\uC790", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		p1.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel lblNewLabel = new JLabel("학번");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);
		
		tfNum = new JTextField();
		panel_1.add(tfNum);
		tfNum.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		tfName = new JTextField();
		panel_1.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("단과대");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_3);
		
		tfcollege = new JTextField();
		panel_1.add(tfcollege);
		tfcollege.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("학과");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_4);
		
		tfmajor = new JTextField();
		panel_1.add(tfmajor);
		tfmajor.setColumns(10);
		
		JPanel p2 = new JPanel();
		std.add(p2, BorderLayout.SOUTH);
		p2.setLayout(new GridLayout(0, 3, 0, 0));
		
		b_register = new JButton("등록");
		p2.add(b_register);
		
		b_update = new JButton("수정");
		p2.add(b_update);
		
		b_delete = new JButton("삭제");
		p2.add(b_delete);
		
		std.add(p1, BorderLayout.CENTER);
		std.add(p2, BorderLayout.SOUTH);
		add(std);
		
		
		
	}
	

}
