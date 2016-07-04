package ie.ul.myproject.models;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "port")
@XmlType(propOrder = { "id", "name", "googleName", "countryCode", "latitude", "longitude" })
public class Port extends Location {
	
	int id ;
	String name ;
	String googleName;
	String countryCode;
	double latitude;
	double longitude;

	public Port() {
	}
	
	public Port(int id, String name, String googleName, String countryCode, double latitude, double longitude) {
		super();
		this.id = id;
		this.name = name;
		this.googleName = googleName;
		this.countryCode = countryCode;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getGoogleName() {
		return googleName;
	}
	public void setGoogleName(String googleName) {
		this.googleName = googleName;
	}

	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return googleName ;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
		
}
