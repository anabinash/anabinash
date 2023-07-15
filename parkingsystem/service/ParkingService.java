package parkingsystem.service;

import java.util.List;
import java.util.Map;

import parkingsystem.dao.Customer;
import parkingsystem.dao.ParkingSpot;
import parkingsystem.dao.vehcile;

public interface ParkingService {
   
	public ParkingSpot parkingspot(ParkingSpot parking);
	public void addvehicle(vehcile v);
	public List<vehcile> getvechiledetails();
	
}
