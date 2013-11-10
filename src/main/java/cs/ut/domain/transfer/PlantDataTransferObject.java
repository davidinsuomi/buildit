package cs.ut.domain.transfer;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;

public class PlantDataTransferObject {

//	
//	Create a JavaBean that will contain the name of the plant to be queried, start and end date of the hire 
//	period, and the id of the selected plant (the id of the plant will be useful for passing the parameter along the 
//	process to the creation of the plant hire request). You can create the JavaBean by either executing 
	
	private String name;
	
	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
	private DateTime startDate;
	
	
	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
	private DateTime endDate;
	
	
	private int PlantID;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public DateTime getStartDate() {
		return startDate;
	}


	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}


	public DateTime getEndDate() {
		return endDate;
	}


	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}


	public int getPlantID() {
		return PlantID;
	}


	public void setPlantID(int plantID) {
		PlantID = plantID;
	}
	
	
	
	

}
