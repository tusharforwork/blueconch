package blueconch.code.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import blueconch.code.model.Product;

public class ProductRepository {
	public final static String VISIBLE = "visible";
	public final static String NON_VISIBLE = "nonvisible";
	
	private static List<Product> products = new ArrayList<Product>();
	static {
		Product p1 = new Product(1, "monitor", 122.90, VISIBLE);
		Product p2 = new Product(2, "RAM", 992.30, NON_VISIBLE);
		Product p3 = new Product(3, "HDD", 133.90, VISIBLE);
		Product p4 = new Product(4, "mouse", 342.50, VISIBLE);
		Product p5 = new Product(5, "dvd", 90.90, VISIBLE);
		Product p6 = new Product(6, "laptop", 1112.90, NON_VISIBLE);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
	}
	public static List<Product> getProducts(){
		return products;
	}
	
//	public static Product[] getArrayProducts(){
//		return (Product[])products.toArray();
//	}
}
