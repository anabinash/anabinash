package atm.controller;

import java.util.Map;
import java.util.Scanner;

import atm.dao.AtmDAO;
import atm.service.AtmService;
import atm.service.AtmServiceImpl;

public class AtmController {


	
	  Scanner sc=new Scanner(System.in);
	  AtmService  atmservice=new AtmServiceImpl();
	  
	  
	 public  void addcustomer( ) {
		  AtmDAO customer=new AtmDAO();
		
		  
		  
		  System.out.println("Eneter name");
		  String name=sc.nextLine();
		  customer.setPerson_nm(name);
		  
		  System.out.println("enter AC number");
		  Integer ac_No=sc.nextInt();
		  customer.setAtmno(ac_No);
		  
		  
		  System.out.println("Eneter IFC Code");
		  String ifc=sc.nextLine();
		  customer.setifc(ifc);
		  
		  sc.next();
		  System.out.println("Enter Psw");
		  Integer psw=sc.nextInt();
		  customer.setPsw(psw);
		  
		 atmservice.savecustomer(customer);
		 
		  
	  }
	 public Map<Integer,AtmDAO> getaccountdetails( ){
		return  atmservice.getcustomerdetails();
           
	 }
	
	
}
