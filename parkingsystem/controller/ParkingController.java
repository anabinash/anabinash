package parkingsystem.controller;

import java.util.Scanner;

import parkingsystem.dao.EntryGate;
import parkingsystem.dao.vehcile;
import parkingsystem.service.ParkingService;
import parkingsystem.service.ParkingServiceImpl;

public class ParkingController {

	ParkingService parkingservice;
	 
	Scanner sc3=new Scanner(System.in);
    EntryGate entry=new EntryGate();
	vehcile van=new vehcile();
	
	ParkingService parkingss=new ParkingServiceImpl();
		
		
	
    public void parkVehcile() {
    	System.out.println("enter parking spot and gate number");
    	System.out.println("1.large \n 2.small \n 3.midium");
    	Integer choice_parking=sc3.nextInt();
    	
    	
    	switch(choice_parking) {
    	case 1:
    		
    		
    		System.out.println("enter gate no");
    		Integer gate_no=sc3.nextInt();
    		sc3.nextLine();
    		
    		System.out.println("Enter car color");
    		String car_color=sc3.nextLine();
    		van.setColor(car_color);
    	       		
    		System.out.println("Eneter car No");
    		Integer car_no=sc3.nextInt();
    		van.setCar_no(car_no);
    
    	    entry.setGate_no(gate_no);
    	    van.setEntrygate(entry);
    	    parkingss.addvehicle(van);
    		break;
    	case 2:
    		
    		System.out.println("enter gate no");
    		Integer gate_no2=sc3.nextInt();
    		sc3.nextLine();
    		
    		
    		System.out.println("Enter bike color");
    		String bike_color=sc3.nextLine();
    		
    		van.setColor(bike_color);
    		
    		System.out.println("Eneter bike No");
    		Integer bike_no=sc3.nextInt();
    		
    		 entry.setGate_no(gate_no2);
     	    van.setEntrygate(entry);
    	    parkingss.addvehicle(van);
    		break;
    		
    	case 3:
    		System.out.println("enter gate no");
    		Integer gate_no3=sc3.nextInt();
    		sc3.nextLine();
    		System.out.println("Enter vehcile color");
    		String v_color=sc3.nextLine();
    	
    		System.out.println("Eneter car No");
    		Integer v_no=sc3.nextInt();
    		
    		 entry.setGate_no(gate_no3);
     	    van.setEntrygate(entry);
    	    parkingss.addvehicle(van);
    		break;	
    		
    	}
    	
    	
    }
   
	
}
