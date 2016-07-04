package ie.ul.myproject.dao;

import ie.ul.myproject.models.LandLocation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PremiseDAO {
	
	public static List<LandLocation> listPremises(String country) {
		List<LandLocation> premises = new ArrayList<LandLocation>();

		try {
			Connection con = DriverManager.getConnection(
					"jdbc:postgresql://localhost/projectdb", "postgres", "1234");

			String sql = "SELECT * FROM premise WHERE country = ?";
			PreparedStatement statement = con.prepareStatement(sql);

			statement.setObject(1, country);
			ResultSet rs = statement.executeQuery();
			
			//System.out.println("before while");
			while (rs.next()) {
				String name = rs.getString("name");
				String address = rs.getString("address");
				System.out.println("Name: " + name + ", Address: " + address + ", Country: " + country);
				LandLocation p = new LandLocation(name, address, country);
				premises.add(p);
			}
			statement.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return premises;
	}
	
	public static List<LandLocation> listAllPremises() {
		List<LandLocation> premises = new ArrayList<LandLocation>();

		try {
			Connection con = DriverManager.getConnection(
					"jdbc:postgresql://localhost/projectdb", "postgres", "1234");

			String sql = "SELECT * FROM premise";
			PreparedStatement statement = con.prepareStatement(sql);

			ResultSet rs = statement.executeQuery();
			
			//System.out.println("before while");
			while (rs.next()) {
				String name = rs.getString("name");
				String address = rs.getString("address");
				String country = rs.getString("country");
				//System.out.println("Name: " + name + " Country: " + country);
				LandLocation p = new LandLocation(name, address, country);
				premises.add(p);
			}
			statement.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return premises;
	}

}
