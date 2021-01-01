package publicTransport;

public class Bus {
	private String name;
	private String type;
	private String from;
	private String to;
	private String date;
	private String fare;
	private String departure_Time;
	private String arrival_Time;
	private int num_Of_Seat;
	
	
	public Bus(String name, String type, String from, String to,String date, String fare,String departure_Time, String arrival_Time, int num_Of_Seat){
		
		setName(name);
		setType(type);
		setFrom(from);
		setTo(to);
		setDate(date);
		setFare(fare);
		setDeparture_Time(departure_Time);
		setArrival_Time(arrival_Time);
		setNum_Of_Seat(num_Of_Seat);
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getFare() {
		return fare;
	}


	public void setFare(String fare) {
		this.fare = fare;
	}


	public String getDeparture_Time() {
		return departure_Time;
	}


	public void setDeparture_Time(String departure_Time) {
		this.departure_Time = departure_Time;
	}


	public String getArrival_Time() {
		return arrival_Time;
	}


	public void setArrival_Time(String arrival_Time) {
		this.arrival_Time = arrival_Time;
	}


	public int getNum_Of_Seat() {
		return num_Of_Seat;
	}


	public void setNum_Of_Seat(int num_Of_Seat) {
		this.num_Of_Seat = num_Of_Seat;
	}
	
	
}
