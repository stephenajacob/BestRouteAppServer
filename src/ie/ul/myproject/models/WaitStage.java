package ie.ul.myproject.models;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class WaitStage extends Stage {
	
	LocalTime startTime ;
	LocalTime endTime;

	
	public WaitStage(LocalTime startTime, LocalTime endTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
	}

	@Override
	public double getTime() {
		long minutes = startTime.until(endTime, ChronoUnit.MINUTES);
		
		if(minutes < 0){
			minutes += Duration.ofDays(1).toMinutes();
		}
		return minutes;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	
	public String toString(){
		return "[" + startTime + ", " + endTime + "]";
	}

}
