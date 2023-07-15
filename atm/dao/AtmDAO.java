package atm.dao;

public class AtmDAO {

   private Integer atmno;
   private String person_nm;
   private Integer psw;
   private Integer amount;
   private String ifc;
   
public Integer getAtmno() {
	return atmno;
}
public void setAtmno(Integer atmno) {
	this.atmno = atmno;
}
public String getPerson_nm() {
	return person_nm;
}
public void setPerson_nm(String person_nm) {
	this.person_nm = person_nm;
}
public Integer getPsw() {
	return psw;
}
public void setPsw(Integer psw) {
	this.psw = psw;
}
public Integer getAmount() {
	return amount;
}
public void setAmount(Integer amount) {
	this.amount = amount;
}
public void setifc(String ifc) {
	this.ifc=ifc;
}
public String getifc() {
	return ifc;
}
@Override
public String toString() {
	return "AtmDAO [atmno=" + atmno + ", person_nm=" + person_nm + ", psw=" + psw + ", amount=" + amount + "]";
}
public AtmDAO() {
	super();
}
   
   
	
}
