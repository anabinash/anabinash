package parkingsystem.service;

import java.util.ArrayList;
import java.util.Map;

import parkingsystem.dao.Ticket;

public interface TicketService {
   
	
	public Ticket addticket(Ticket ticket) ;
	public Map<Integer,Ticket> getticket();
}
