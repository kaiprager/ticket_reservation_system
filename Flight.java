package ticket_reservation_system;

import java.util.ArrayList;
import java.util.List;

public class Flight {
	
	private List<Passenger> passengerList;

	public Flight() {
		this.passengerList = new ArrayList<>();
	}
	
	public void reserveSeat(String passengerName, SeatClass seatClass) {
		Passenger passenger = new Passenger(passengerName, seatClass);
		passengerList.add(passenger);
		System.out.println(passengerName + " reserved a seat in " + seatClass);
	}

	public void cancelReservation(String passengerName) {
		passengerList.removeIf(passenger -> passenger.getPassengerName().equals(passengerName));
		System.out.println(passengerName + " has cenceled the reservation.");
	}
	
	public void displayPassengerList() {
		System.out.println("Passenger List: ");
		for(Passenger passenger : passengerList) {
			System.out.println("Passenger Name: " + passenger.getPassengerName() + "\t Seat Class: " 
					+ passenger.getSeatClass() + "\t Ticket Price: €" + passenger.getTicketPrice());
		}
	}
	
	public double calculateTotalRevenue() {
		double totalRevenue = 0.0;
		for(Passenger passenger : passengerList) {
			totalRevenue += passenger.getTicketPrice();
		}
		
		return totalRevenue;
	}
}
