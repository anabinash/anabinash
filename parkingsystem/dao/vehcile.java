package parkingsystem.dao;

public class vehcile {
	
    
     private String v_type;
     private String color;
     private Integer car_no;
     private EntryGate entrygate;
	public String getV_type() {
		return v_type;
	}
	public void setV_type(String v_type) {
		this.v_type = v_type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getCar_no() {
		return car_no;
	}
	public void setCar_no(Integer car_no) {
		this.car_no = car_no;
	}
	public EntryGate getEntrygate() {
		return entrygate;
	}
	public void setEntrygate(EntryGate entrygate) {
		this.entrygate = entrygate;
	}
	@Override
	public String toString() {
		return "vehcile [v_type=" + v_type + ", color=" + color + ", car_no=" + car_no + ", entrygate=" + entrygate
				+ "]";
	}
	
     
      
	
	
	
	
     
	
}
