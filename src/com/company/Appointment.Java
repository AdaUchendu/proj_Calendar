import java.time.*;
import java.util.*;
public class Appointment {

	private String AptID;
	private String Name; 
	private String Description;
	private LocalTime Time;
	private Date Date;

	public Appointment(String AptID,String Name,String Description,Date Date, LocalTime Time){  
		this.AptID = AptID; 
		this.Name = Name;
		this.Description = Description;
		this.Date = Date; 
		this.Time = Time;
	}
	public String AptID() {
		return AptID;
	}

	public String getName(){ 
		return Name; 
	} 

	public String getDescription() {
		return Description;
	}

	public LocalTime getTime() {
		return Time;
	}

	public Date getDate(){ 
		return Date; 
	} 


	public void setAptID(String AptID) {
		this.AptID = AptID;
	}

	public void setName(String Name) { 
		this.Name = Name;
	}

	public void setDescription(String Description) { 
		this.Description = Description;
	}

	public void setTime(LocalTime Time){ 
		this.Time = Time; 
	} 

	public void setDate(Date Date){ 
		this.Date = Date;
	} 
}


