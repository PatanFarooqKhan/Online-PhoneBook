package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatreDao {
	public static boolean updateData(String name,long phone,int id)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/phone_book","root","root");
			String sql="UPDATE phonebook set name=?,phone=? WHERE id=?";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setLong(2, phone);
			ps.setInt(3, id);
			ps.executeUpdate();
			
			return true;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
