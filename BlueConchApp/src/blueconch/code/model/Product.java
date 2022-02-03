package blueconch.code.model;

public class Product {

	private int productCode;
	private String name;
	private double price;
	private String category;

	public Product(int productCode, String name, double price, String category) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "\nProduct [productCode=" + productCode + ", name=" + name + ", price=" + price + ", category=" + category
				+ "]";
	}

}
