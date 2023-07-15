package parkingsystem.dao;

public class Customer {
	
	private Integer cust_ID;
	private String Cust_Name;
	private EntryGate gatename;
	private vehcile vehcile;
	
	public Integer getCust_ID() {
		return cust_ID;
	}
	public void setCust_ID(Integer cust_ID) {
		this.cust_ID = cust_ID;
	}
	public String getCust_Name() {
		return Cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}
	public EntryGate getGatename() {
		return gatename;
	}
	public void setGatename(EntryGate gatename) {
		this.gatename = gatename;
	}
	public vehcile getVehcile() {
		return vehcile;
	}
	public void setVehcile(vehcile vehcile) {
		this.vehcile = vehcile;
	}
	@Override
	public String toString() {
		return "Customer [cust_ID=" + cust_ID + ", Cust_Name=" + Cust_Name + ", gatename=" + gatename + ", vehcile="
				+ vehcile + "]";
	}
	
	

}
