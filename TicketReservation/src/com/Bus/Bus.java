package com.Bus;

public class Bus {
	private String busId;
	private String startPlace;
	private String endPlace;
	private String dTime;
	private String aTime;
	private String type;
	private int numOfSeats;
	private float fare;
	String unames;
	
	public Bus(String busId, String startPlace, String endPlace, String dTime, String aTime, String type,
			int numOfSeats, float fare,String unames) {
		this.busId = busId;
		this.startPlace = startPlace;
		this.endPlace = endPlace;
		this.dTime = dTime;
		this.aTime = aTime;
		this.type = type;
		this.numOfSeats = numOfSeats;
		this.fare = fare;
		this.unames = unames;
	}//End Of Overloaded Constructor..

	public String getBusId() {
		return busId;
	}



	public String getStartPlace() {
		return startPlace;
	}



	public String getEndPlace() {
		return endPlace;
	}



	public String getdTime() {
		return dTime;
	}


	public String getaTime() {
		return aTime;
	}


	public String getType() {
		return type;
	}



	public int getNumOfSeats() {
		return numOfSeats;
	}


	public float getFare() {
		return fare;
	}
	
	public String getUname(){
		return unames;
	}


	

}//End Of The bus Class
