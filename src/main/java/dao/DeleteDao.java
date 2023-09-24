package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDao {
	public static boolean deleteContact(int  id) {
		String sql="DELETE FROM phonebook WHERE id="+id;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/phone_book","root","root");
			Statement st= con.createStatement();
			st.execute(sql);
			con.close();
			
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	
}
