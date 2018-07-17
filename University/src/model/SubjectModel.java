package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.SubjectVO;


public class SubjectModel {
	Connection con;
	
	public SubjectModel() throws Exception{
		con=DBConn.getConnection();
	}
	public ArrayList getSubData(String subject) throws Exception {
		
		
		String sql="select * from subject where major=?";
		
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, subject);
		
		ResultSet rs=st.executeQuery();
		ArrayList list1 = new ArrayList();
		
		while(rs.next()) {
			ArrayList list = new ArrayList();
			list.add(rs.getString("SUBJECTID"));
			list.add(rs.getString("MAJORNAME"));
			list.add(rs.getInt("GRADE"));
			list.add(rs.getString("PROFESSOR"));
			list.add(rs.getString("PLACE"));
			list.add(rs.getString("STARTTIME"));
			list.add(rs.getString("ENDTIME"));
			list.add(rs.getString("DIVISION"));
			list.add(rs.getInt("TOTAL"));
			list.add(rs.getInt("APPLY_NUMBER"));
			list.add(rs.getString("MAJOR"));
			list.add(rs.getInt("OPEN_SEMESTER"));
			list1.add(list);
				
		}
		
		
		
		return list1;

	}
}
