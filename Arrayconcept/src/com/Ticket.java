package com;

public class Ticket {

	public Integer ticketPrice (Integer cost1, Integer cost2, Integer cost3) {
		
		Integer finalTicketPrice = cost1+cost2+cost3;
		return finalTicketPrice;
		
		
	}
	
	public String ticketDestination(String destination, Integer code) {
		
		String finalDestination ="Destination is :: " +  destination + "with code is : " +  code.toString();
		return finalDestination;
	}
	
	public String passengerMail(String mailids, Integer code) {
		
		String finalStr = "";
		if(mailids.contains(",")) {
			String[] mailArray = mailids.split(",");
			for (int i=0;i<mailArray.length;i++) {
				finalStr =finalStr +  mailArray[i];
			}
			finalStr = finalStr.concat(code.toString());
			
		}
		else {
			String[] mailArray = new String[1];
			mailArray[0]=mailids;
			
			for (int i=0;i<mailArray.length;i++) {
				finalStr = finalStr +mailArray[i];
			}
			finalStr = finalStr.concat(code.toString());
			
			
		}
		return finalStr;
		
	}
	
	
	
	
	
}
