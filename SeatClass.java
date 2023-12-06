package ticket_reservation_system;

public enum SeatClass {
	
	FIRST_CLASS(1000.0), BUSINESS_CLASS(7500.0), ECONOMY_CLASS(400.0);
	
	private double ticketPrice;

	private SeatClass(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}
	
	

}
