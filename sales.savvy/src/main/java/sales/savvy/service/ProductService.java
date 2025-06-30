package sales.savvy.service;

import java.util.List;

import sales.savvy.entity.Product;

public interface ProductService {
	void addProduct(Product prod);
	Product searchProduct(Long id);
	List<Product> getAllProducts();
	void updateProduct(Product prod);
	void deleteProduct(Long id);
}
