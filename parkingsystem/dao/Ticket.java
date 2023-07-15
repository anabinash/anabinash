package parkingsystem.dao;

import java.security.KeyStore.Entry;

public class Ticket {
	
  private Integer ticketID;
  private Customer customer;
  private EntryGate entryGate;
  private ParkingSpot parkingspot;
  private vehcile vehicle;
  
public Integer getTicketID() {
	return ticketID;
}
public void setTicketID(Integer ticketID) {
	this.ticketID = ticketID;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public EntryGate getEntryGate() {
	return entryGate;
}
public void setEntryGate(EntryGate entryGate) {
	this.entryGate = entryGate;
}
public ParkingSpot getParkingspot() {
	return parkingspot;
}
public void setParkingspot(ParkingSpot parkingspot) {
	this.parkingspot = parkingspot;
}
public vehcile getVehicle() {
	return vehicle;
}
public void setVehicle(vehcile vehicle) {
	this.vehicle = vehicle;
}
@Override
public String toString() {
	return "Ticket [ticketID=" + ticketID + ", customer=" + customer + ", entryGate=" + entryGate + ", parkingspot="
			+ parkingspot + ", vehicle=" + vehicle + "]";
}
  
 

 
}
