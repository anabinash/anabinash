package parkingsystem.service;

import java.util.HashMap;
import java.util.Map;

import parkingsystem.controller.TicketController;
import parkingsystem.dao.Customer;

public class CustomerServiceImpl implements CustomerService {


	public TicketController ticketcontroller;
	Map<Integer,Customer> map=new HashMap<>();
	
	public Customer addcustomer(Customer customer) {
		
		map.put(customer.getCust_ID(), customer);
		return customer;
	}
	public Map<Integer,Customer> getcustomerdetai(){
		return map;
	}
}
