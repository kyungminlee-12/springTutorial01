package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		try {
			String dbURL="jdbc:mysql://localhost:3306/BBS";
			String dbID="kyungmin_root";
			String dbPassword="kyungmin_root";
			Class.forName("com.mtsql.jdbc.Dri)
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
