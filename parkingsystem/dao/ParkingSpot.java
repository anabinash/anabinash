package parkingsystem.dao;

public class ParkingSpot {
	
	private String small;
	private String medium;
	private String large;
	private vehcile vehcile;
	private Customer customer;
	public String getSmall() {
		return small;
	}
	public void setSmall(String small) {
		this.small = small;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getLarge() {
		return large;
	}
	public void setLarge(String large) {
		this.large = large;
	}
	public vehcile getVehcile() {
		return vehcile;
	}
	public void setVehcile(vehcile vehcile) {
		this.vehcile = vehcile;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "ParkingSpot [small=" + small + ", medium=" + medium + ", large=" + large + ", vehcile=" + vehcile
				+ ", customer=" + customer + "]";
	}
	
	
	
}
