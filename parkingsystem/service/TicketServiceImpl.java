package parkingsystem.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import parkingsystem.dao.Ticket;

public class TicketServiceImpl implements TicketService {

	
	Map<Integer,Ticket> ticketmap=new HashMap<>();
	
	Ticket tk=new Ticket();
	
	public Ticket addticket(Ticket ticket) {
		ticketmap.put(ticket.getTicketID(), ticket);
		return ticket;
	}
	public Map<Integer,Ticket>  getticket(){
		return  ticketmap;
	}
	
}
