package Admin;

public class Buses {
	
	private String busID;
	private String startPlace;
	private String endPlace;
	private String departureTime;
	private String arrivalTime;
	private String type;
	private int numOfSeats;
	private float fare;
	private String userName;
	
	public Buses(String busID, String startPlace, String endPlace, String departureTime, String arrivalTime,
			String type, int numOfSeats, float fare, String userName) {
		super();
		this.busID = busID;
		this.startPlace = startPlace;
		this.endPlace = endPlace;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.type = type;
		this.numOfSeats = numOfSeats;
		this.fare = fare;
		this.userName = userName;
	}

	public String getBusID() {
		return busID;
	}

	public String getStartPlace() {
		return startPlace;
	}

	public String getEndPlace() {
		return endPlace;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
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

	public String getUserName() {
		return userName;
	}
	
	
	
	
}
