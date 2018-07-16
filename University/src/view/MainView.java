package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;


	/**
	 * Create the frame.
	 */
	public MainView() {
		setResizable(false);
		setTitle("University");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "\uC0AC\uC6A9\uC790 \uC778\uC99D", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\uD559\uC0DD", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("로그인");
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\uAD00\uB9AC\uC790", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("관리자로 로그인");
		panel_1.add(btnNewButton);
	}

}
