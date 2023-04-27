package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnection;
import model.Customer;

public class CustomerDao {
	public static void insertCustomer(Customer c) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into customer(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, c.getName());
			pst.setLong(2, c.getContact());
			pst.setString(3, c.getAddress());
			pst.setString(4, c.getEmail());
			pst.setString(5, c.getPassword());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Customer loginCustomer(Customer c) {
		Customer c1 = null;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from customer where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, c.getEmail());
			pst.setString(2, c.getPassword());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				c1 = new Customer();
				c1.setId(rs.getInt("id"));
				c1.setName(rs.getString("name"));
				c1.setContact(rs.getLong("contact"));
				c1.setAddress(rs.getString("address"));
				c1.setEmail(rs.getString("email"));
				c1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c1;
	}
	public static void updateProfile(Customer c) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "update customer set name=?,contact=?,address=?,email=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, c.getName());
			pst.setLong(2, c.getContact());
			pst.setString(3, c.getAddress());
			pst.setString(4, c.getEmail());
			pst.setInt(5, c.getId());
			pst.executeUpdate();
			System.out.println("data updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		public static boolean checkOldPassword(int id,String op) {
			boolean flag = false;
			try {
				Connection conn = DBConnection.createConnection();
				String sql="select * from customer where id=? and password=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				pst.setString(2, op);
				ResultSet rSet = pst.executeQuery();
				if(rSet.next()) {
					flag = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return flag;
		}
		public static void changePasswrod(int id,String np) {
			try {
				Connection conn = DBConnection.createConnection();
				String sql="update customer set password=? where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, np);
				pst.setInt(2, id);
				pst.executeUpdate();
				System.out.println("password changed");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static boolean checkEmail(String email) {
			boolean flag = false;
			try {
				Connection conn = DBConnection.createConnection();
				String sql="select * from customer where email=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, email);
				ResultSet rs  = pst.executeQuery();
				if(rs.next()) {
					flag = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return flag;
		}
		public static void changeNewPasswrod(String email,String np) {
			try {
				Connection conn = DBConnection.createConnection();
				String sql="update customer set password=? where email=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, np);
				pst.setString(2, email);
				pst.executeUpdate();
				System.out.println("password changed");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
