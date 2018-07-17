package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ManagerView extends JFrame {

	private JPanel ManagerPanel;
	private JTable table;
	private JTextField tfNum;
	private JTextField tfName;
	private JTextField tfcollege;
	private JTextField tfmajor;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerView frame = new ManagerView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManagerView() {
		setTitle("관리모드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		ManagerPanel = new JPanel();
		ManagerPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		ManagerPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane tab_manager = new JTabbedPane(JTabbedPane.TOP);
	
		
		Manager_Std std1 = new Manager_Std();
		tab_manager.addTab("학생", null, std1, null);
		std1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel subject = new JPanel();
		tab_manager.addTab("과목", null, subject, null);
		
		ManagerPanel.add(tab_manager);
		setContentPane(ManagerPanel);
		
		
		

		
		
		setSize(1000,600);
	}

}
