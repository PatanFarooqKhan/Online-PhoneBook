package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo {

	public static boolean saveSignin(String user,String password)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			String sql="INSERT INTO demo VALUES(?,?)";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, password);
			ps.execute();
			con.close();
			
			return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
