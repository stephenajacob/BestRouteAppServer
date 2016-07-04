package ie.ul.myproject.models;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "crossing")
@XmlType(propOrder = { "id", "fromPortId", "toPortId", "ferryCompanyId",
		"departureTime", "arrivalTime", "mon", "tue", "wed", "thu", "fri",
		"sat", "sun" })
public class Crossing extends Stage {

	int id;
	int fromPortId;
	int toPortId;
	int ferryCompanyId;
	String departureTime;
	String arrivalTime;
	boolean mon, tue, wed, thu, fri, sat, sun;

	public Crossing() {

	}

	public Crossing(int id, int fromPortId, int toPortId, int ferryCompanyId,
			String departureTime, String arrivalTime, boolean mon, boolean tue,
			boolean wed, boolean thu, boolean fri, boolean sat, boolean sun) {
		super();
		this.id = id;
		this.fromPortId = fromPortId;
		this.toPortId = toPortId;
		this.ferryCompanyId = ferryCompanyId;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;		
		this.mon = mon;
		this.tue = tue;
		this.wed = wed;
		this.thu = thu;
		this.fri = fri;
		this.sat = sat;
		this.sun = sun;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFromPortId() {
		return fromPortId;
	}

	public void setFromPortId(int fromPortId) {
		this.fromPortId = fromPortId;
	}

	public int getToPortId() {
		return toPortId;
	}

	public void setToPortId(int toPortId) {
		this.toPortId = toPortId;
	}

	public int getFerryCompanyId() {
		return ferryCompanyId;
	}

	public void setFerryCompanyId(int ferryCompanyId) {
		this.ferryCompanyId = ferryCompanyId;
	}
	
	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public boolean isMon() {
		return mon;
	}

	public void setMon(boolean mon) {
		this.mon = mon;
	}

	public boolean isTue() {
		return tue;
	}

	public void setTue(boolean tue) {
		this.tue = tue;
	}

	public boolean isWed() {
		return wed;
	}

	public void setWed(boolean wed) {
		this.wed = wed;
	}

	public boolean isThu() {
		return thu;
	}

	public void setThu(boolean thu) {
		this.thu = thu;
	}

	public boolean isFri() {
		return fri;
	}

	public void setFri(boolean fri) {
		this.fri = fri;
	}

	public boolean isSat() {
		return sat;
	}

	public void setSat(boolean sat) {
		this.sat = sat;
	}

	public boolean isSun() {
		return sun;
	}

	public void setSun(boolean sun) {
		this.sun = sun;
	}

	public String toString() {
		return "[id " + id + " from " + fromPortId + ", to " + toPortId + " time "
				+ getTime() + "]";
	}

	@Override
	public double getTime() {
		LocalTime dep = LocalTime.parse(departureTime);
		LocalTime arr = LocalTime.parse(arrivalTime);

		long minutes = dep.until(arr, ChronoUnit.MINUTES);
		if(minutes < 0) {
			minutes += Duration.ofDays(1).toMinutes() ;
		}
		return minutes;
	}

}
