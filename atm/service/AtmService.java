package atm.service;

import java.util.Map;

import atm.dao.AtmDAO;

public interface AtmService {

	public void savecustomer(AtmDAO customer);
	
	
	public Map<Integer, AtmDAO> getcustomerdetails();
	
	
	
}
