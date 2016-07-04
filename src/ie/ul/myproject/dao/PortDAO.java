package ie.ul.myproject.dao;

import ie.ul.myproject.models.Port;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PortDAO {

	public static List<Port> listPorts(String countryCode) {
		List<Port> ports = new ArrayList<Port>();

		try {
			Connection con = UtilDAO.getConnection();
			String sql = "SELECT * FROM port WHERE countryCode = ?";
			PreparedStatement statement = con.prepareStatement(sql);

			statement.setObject(1, countryCode);
			ResultSet rs = statement.executeQuery();
			
			//System.out.println("before while");
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String googleName = rs.getString("googleName");
				double latitude = rs.getDouble("latitude");
				double longitude = rs.getDouble("longitude");
				Port p = new Port(id, name, googleName, countryCode, latitude, longitude);
				ports.add(p);
			}
			statement.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ports;
	}

}
