package ie.ul.myproject.models;

import java.util.ArrayList;
import java.util.List;

public class Route {
	
	List <Stage> stages = new ArrayList <Stage>();

	public Route() {
		super();
	}

	public List<Stage> getStages() {
		return stages;
	}

	public void addStage(Stage stage){
		stages.add(stage);
	}
	
	public String toString(){
		String s = "[";
		for (Stage stage : stages){
			s += stage.toString() + " ";
		}
		s += "]";
		return s;
	}
	
	public Route copyRoute(){
		Route r = new Route();
		for (Stage stage : stages){
			r.addStage(stage);
		}
		return r;
	}

	public double getTime() {
		
		double totalTime = 0.0;
		//so shortesRoute works
		if (stages.size() == 0){
			return Double.MAX_VALUE;
		}
		for(Stage stage: stages){
			totalTime += stage.getTime();
		}
		return totalTime ;
	}


	
}
