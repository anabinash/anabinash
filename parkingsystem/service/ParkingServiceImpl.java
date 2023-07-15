package parkingsystem.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import parkingsystem.dao.ParkingSpot;
import parkingsystem.dao.vehcile;

public class ParkingServiceImpl implements ParkingService {

	Map<Integer,vehcile> vehcile=new HashMap<>();
	public ParkingSpot parkingspot(ParkingSpot parking) {
		return null;
	}
	public void addvehicle(vehcile v) {
		vehcile.add(v);
	}
	public List<vehcile> getvechiledetails( ) {
		return vehcile;
	}

}
