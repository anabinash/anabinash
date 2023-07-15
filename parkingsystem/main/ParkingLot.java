package parkingsystem.main;

import java.util.Scanner;

import parkingsystem.controller.ParkingLotServices;
import parkingsystem.controller.TicketController;
import parkingsystem.dao.Customer;
import parkingsystem.dao.Ticket;

public class ParkingLot {
	
	
   
	public static void main(String arg[]) {
		
	   
	    	 
	  ParkingLotServices parkinglotservice=new ParkingLotServices();
		parkinglotservice.parkingservice();
	}
	
}
