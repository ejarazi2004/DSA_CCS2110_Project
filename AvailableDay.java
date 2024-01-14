package service;

public class AvailableDay {
	private String date;
	private String startLocation;
	private String endLocation;
	private Boolean availability;
	
	public AvailableDay(String date, String startLocation, String endLocation, Boolean availability) {
		super();
		this.date = date;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.availability = availability;
	}


    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public String getStartlocation() {
        return startLocation;
    }
    
    public void setStartlocation(String startLocation) {
        this.startLocation = startLocation;
    }
    
    public String getEndlocation() {
        return endLocation;
    }
    public void setEndlocation(String endLocation) {
        this.endLocation = endLocation;
    }
    
    public Boolean getAvailability() {
        return availability;
    }
    
    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
}