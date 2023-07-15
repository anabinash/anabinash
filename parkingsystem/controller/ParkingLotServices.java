package parkingsystem.controller;

import java.util.Scanner;

import parkingsystem.dao.Customer;
import parkingsystem.dao.Ticket;

public class ParkingLotServices {
    
	
	Scanner scc=new Scanner(System.in);
	
	public void parkingservice() {
		 Customer cust=new Customer();
		    TicketController ticketcontroller=new TicketController();
		    System.out.println("our services ->>");
		    System.out.println("1.AddCustomer \n 2.GenerateTicket \n 3.Viewticket ");
		    Integer choice=scc.nextInt();
		     switch(choice) {
		     case 1:
		 		 cust=ticketcontroller.addcustomer();
		 		System.out.println(cust.getCust_Name()+" "+cust.getCust_ID());
		 		break;
		     case 2:
		    	 Ticket tkk=new Ticket();
		    	 cust=ticketcontroller.addcustomer();
		    	Ticket tk=ticketcontroller.generateticket(cust);
		    	
		    	break;
		     case 3:
		    	 Ticket tkk2=new Ticket();
		    	 cust=ticketcontroller.addcustomer();
		    	 
		    	Ticket tk2=ticketcontroller.generateticket(cust);
		    	tk2.setTicketID(cust.getCust_ID());
  	    	   ticketcontroller.viewticket(tk2,cust);
		    	
		    	 
		     }
		    
			
	}
	
	
}
