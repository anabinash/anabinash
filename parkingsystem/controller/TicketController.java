package parkingsystem.controller;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import parkingsystem.dao.Customer;
import parkingsystem.dao.Ticket;
import parkingsystem.dao.vehcile;
import parkingsystem.service.CustomerService;
import parkingsystem.service.CustomerServiceImpl;
import parkingsystem.service.ParkingService;
import parkingsystem.service.ParkingServiceImpl;
import parkingsystem.service.TicketServiceImpl;

public class TicketController {

	  TicketController ticketcontroller;
	   
	  Scanner sc=new Scanner(System.in);
	  Customer customer=new Customer();
	   CustomerService custserviceimpl=new CustomerServiceImpl();
	   ParkingLotServices vehcilecontroller=new ParkingLotServices();
	   ParkingController parkcontroller=new ParkingController();
	   TicketServiceImpl serviceticketimpl=new TicketServiceImpl();
	   ParkingService parkingservice=new ParkingServiceImpl();
	   Ticket ticket=new Ticket();
	  vehcile vehcile=new vehcile();
	  
	 
	public Customer addcustomer( ) {
		
		System.out.println("Eneter name");
		String CustName=sc.nextLine();
		System.out.println("create customer id");
		Integer CustId=sc.nextInt();
		customer.setCust_ID(CustId);
		customer.setCust_Name(CustName);
		return custserviceimpl.addcustomer(customer);
		
	}
	public Ticket generateticket( Customer cust) {
	
		System.out.println("Ticket Generator");
		Integer ticket_Id=customer.getCust_ID();
		
		System.out.println("You ticket id is="+cust.getCust_ID());
		parkcontroller.parkVehcile();
		serviceticketimpl.addticket(ticket);
		return ticket;
		
	}
	
	public void viewticket(Ticket tk2,Customer cust) {
		
		Map<Integer,Customer> cus=custserviceimpl.getcustomerdetai();
		Customer co=cus.get(cust.getCust_ID());
	  Map<Integer,Ticket> tik =serviceticketimpl.getticket(); 
         Ticket myticket= tik.get(tk2.getTicketID());
	  
   System.out.println("<<<<Your bill is generated >>>>");
    	 System.out.println("You ticket id is="+cust.getCust_ID());
        System.out.println("Your name="+co.getCust_Name());
//        vehcile automobile=co.getVehcile();
        List<vehcile> arryvehcile=parkingservice.getvechiledetails();
          vehcile vv=arryvehcile.get(0);
          System.out.println(vv.getColor());
    
   	
	}

}
