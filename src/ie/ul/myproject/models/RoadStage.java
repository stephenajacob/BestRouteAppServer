package ie.ul.myproject.models;

public class RoadStage extends Stage {
	
	Location from ;
	Location to;
	
	double time;
	double distance;
	
	public RoadStage(){
		
	}

	public RoadStage(Location from, Location to, double time) {
		super();
		this.from = from;
		this.to = to;
		this.time = time;
	}
	
	public String toString(){
		return "[" + from.toString() + ", " + to.toString() + "]" ;
	}

	public Location getTo() {
		return to;
	}

	public Location getFrom() {
		return from ;
	}

	public void setFrom(Location from) {
		this.from = from;
	}

	public void setTo(Location to) {
		this.to = to;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
}
