package jobrole.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import jobrole.dao.Laptops;

public class LaptopServiceImpl implements LaptopService {
       
	
	Map<Integer,Laptops> maps=new HashMap<>();
	Scanner sc=new Scanner(System.in);
	
	public void addlaptops(Laptops laptop) {
		   
		maps.put(1, laptop);
		
		System.out.println("Eneter what you details yoy want");
		System.out.println(); 
		
		Integer num=sc.nextInt();
		if(maps.containsKey(num)) {
			Laptops obj=maps.get(num);
			System.out.println(obj.getBrand());
			System.out.println(obj.getColor());
			System.out.println(obj.getPrice());
		}
		
		else {
			System.out.println("beeta tere se nhi hoga!!!");
		}
		
		
	}

}
