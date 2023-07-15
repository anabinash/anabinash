package parkingsystem.service;

import java.util.Map;

import parkingsystem.dao.Customer;

public interface CustomerService {
	
	
	
	public Customer addcustomer(Customer customer);
	public Map<Integer,Customer> getcustomerdetai();
	
}
