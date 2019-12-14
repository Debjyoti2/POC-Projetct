package com;

public class Airport {

	public static void main(String[] args) {


		Ticket tckt = new Ticket();
		
		String finalDestination = tckt.ticketDestination("United States", 001);
		Integer ticketPrice = tckt.ticketPrice(1000, 2000, 3000);
		String passengerMail = tckt.passengerMail("a@tcs.com", 1);
		
		
		String finalString = finalDestination+ "with ticket price " + ticketPrice.toString() + "passengermail is : " +  passengerMail;
		
		System.out.println("Here find the whole " +  finalString);
		
		

	}

}
