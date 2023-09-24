package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class ContactDao {
	public static boolean saveContact(String name,long phone,String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/phone_book","root","root");
			String sql="INSERT INTO phonebook(name , phone , email) VALUES(?,?,?)";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setLong(2, phone);
			ps.setString(3, email);
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
	
	
	public static ResultSet getAllContacts(String email)
	{
		String sql="SELECT * FROM phonebook WHERE email='"+email+"'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/phone_book","root","root");
			Statement st= con.createStatement();
			return st.executeQuery(sql);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
