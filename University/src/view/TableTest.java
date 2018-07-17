package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class TableTest extends JFrame {

	private JPanel contentPane;
	private JTable test1;
	testModel tm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableTest frame = new TableTest();
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
	public TableTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));
		tm = new testModel();
		test1 = new JTable();
		test1.setModel(tm);
		ArrayList list2 = new ArrayList();
		for(int i = 0; i<2; i++)
		{
			ArrayList list = new ArrayList();
			list.add("abc");
			list.add("bcd");
			list.add("def");
			System.out.println(list);
			list2.add(list);
		}
		
		tm.data = list2;
		tm.fireTableDataChanged();
		
		contentPane.add(test1);
	}
	
	
	//화면에 테이블 붙이는 메소드 
	class testModel extends AbstractTableModel { 

		ArrayList data = new ArrayList();
		String [] columnNames = {"비디오번호","제목","감독"};

		//=============================================================
		// 1. 기본적인 TabelModel  만들기
		// 아래 세 함수는 TabelModel 인터페이스의 추상함수인데
		// AbstractTabelModel에서 구현되지 않았기에...
		// 반드시 사용자 구현 필수!!!!

		public int getColumnCount() { 
			return columnNames.length; 
		} 

		public int getRowCount() { 
			return data.size(); 
		} 

		public Object getValueAt(int row, int col) { 
			ArrayList temp = (ArrayList)data.get( row );
			return temp.get( col ); 
		}

		public String getColumnName(int col){
			return columnNames[col];
		}
	}

}
