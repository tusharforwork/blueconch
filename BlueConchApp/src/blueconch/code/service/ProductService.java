package blueconch.code.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import blueconch.code.model.Product;
import blueconch.code.repository.ProductRepository;

public class ProductService {

//	private ProductRepository repository;

	public String findNameByCode(int code) {
		List<Product> products = ProductRepository.getProducts();
		for (Product product : products) {
			if (product.getProductCode() == code)
				return product.getName();
		}
		return null;
	}

	public Product findMaxPriceProduct(String category) {
		List<Product> listByCategory = ProductRepository.getProducts().stream()
				.filter(prod -> prod.getCategory().equals(category)).collect(Collectors.toList());

		return listByCategory.stream().max(Comparator.comparing(Product::getPrice)).get();
	}

	public List<Product> getProductsByCategory(String category) {
		List<Product> listByCategory = ProductRepository.getProducts().stream()
				.filter(prod -> prod.getCategory().equals(category)).collect(Collectors.toList());

//		List<Product> listByCategory = new ArrayList<>();
//		for (Product product : ProductRepository.getProducts()) {
//			if (product.getCategory().equals(category)) {
//				listByCategory.add(product);
//			}
//		}
//		System.out.println("size of listByCategory: "+ listByCategory.size());
		return listByCategory == null ? null : listByCategory;
	}
}
