package blueconch.code;

import blueconch.code.repository.ProductRepository;
import blueconch.code.service.ProductService;

public class EncapsulationExample {

	public static void main(String[] args) {
		ProductService service = new ProductService();
		
		System.out.println("3 No product " + service.findNameByCode(3));
		
		System.out.println(service.findMaxPriceProduct(ProductRepository.NON_VISIBLE));
		
		System.out.println(service.getProductsByCategory(ProductRepository.VISIBLE));
		
	}
}
