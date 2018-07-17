package model;

import java.sql.Connection;

public class SubjectModel {
	Connection con;
	
	public SubjectModel() throws Exception{
		con=DBConn.getConnection();
	}
}
