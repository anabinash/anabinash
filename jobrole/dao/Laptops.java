package jobrole.dao;

public class Laptops {
    
	private String brand;
	private Integer price;
	private String color;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "Laptops [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	public Laptops() {
	
	}
	
	
}
