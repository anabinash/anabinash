package jobrole.dao;

public class Order {
   private String id;
   private Integer price;
   private Integer queantity;
public Order(String id, Integer price, Integer queantity) {
	super();
	this.id = id;
	this.price = price;
	this.queantity = queantity;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
public Integer getQueantity() {
	return queantity;
}
public void setQueantity(Integer queantity) {
	this.queantity = queantity;
}
@Override
public String toString() {
	return "Order [id=" + id + ", price=" + price + ", queantity=" + queantity + "]";
}
   
   
}
