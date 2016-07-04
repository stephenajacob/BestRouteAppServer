package ie.ul.myproject.dao;

import ie.ul.myproject.models.Crossing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CrossingDAO {
		
	public static List<Crossing> listCrossings(int portId){
		List<Crossing> crossings = new ArrayList<Crossing>();

		try {
			Connection con = UtilDAO.getConnection();

			String sql = "SELECT * FROM crossing WHERE from_port_id = ?";
			PreparedStatement statement = con.prepareStatement(sql);

			statement.setInt(1, portId);
			ResultSet rs = statement.executeQuery();
			
			System.out.println("before while");
			while (rs.next()) {
				int id = rs.getInt("id");
				int fromPortId = rs.getInt("from_port_id");
				int toPortId = rs.getInt("to_port_id");
				int ferryCompanyId = rs.getInt("ferry_company_id");
				String departureTime = rs.getString("departure_time");
				String arrivalTime = rs.getString("arrival_time");
				boolean mon = rs.getBoolean("mon");
				boolean tue = rs.getBoolean("tue");
				boolean wed = rs.getBoolean("wed");
				boolean thu = rs.getBoolean("thu");
				boolean fri = rs.getBoolean("fri");
				boolean sat = rs.getBoolean("sat");
				boolean sun = rs.getBoolean("sun");
				Crossing c = new Crossing(id, fromPortId, toPortId, ferryCompanyId, departureTime, 
						arrivalTime, mon, tue, wed, thu,fri, sat, sun);
				crossings.add(c);
			}
			statement.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return crossings;
	}
}
