package atm.service;

import java.util.HashMap;
import java.util.Map;

import atm.dao.AtmDAO;

public class AtmServiceImpl implements AtmService {
	
	Map<Integer,AtmDAO> mapp=new HashMap<>();

	@Override
	public void savecustomer(AtmDAO customer) {
	  
		mapp.put(customer.getPsw(), customer);
		System.out.println("Account openning  is successfully !!!!!!");
	
	}
	
	public Map<Integer,AtmDAO> getcustomerdetails(){
		return mapp;
	}

}
