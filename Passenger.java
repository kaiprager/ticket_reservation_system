package ticket_reservation_system;

public class Passenger {
	
	private String passengerName;
	private SeatClass seatClass;
	private double ticketPrice;
	
	
	public Passenger(String passengerName, SeatClass seatClass) {
		super();
		this.passengerName = passengerName;
		this.seatClass = seatClass;
		this.ticketPrice = seatClass.getTicketPrice();
	}


	//Getters (and no Setters)
	public String getPassengerName() {
		return passengerName;
	}


	public SeatClass getSeatClass() {
		return seatClass;
	}


	public double getTicketPrice() {
		return ticketPrice;
	}


}
