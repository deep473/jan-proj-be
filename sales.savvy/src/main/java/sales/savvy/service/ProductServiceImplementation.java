package sales.savvy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sales.savvy.entity.Product;
import sales.savvy.repository.ProductRepository;

@Service
public class ProductServiceImplementation 
			implements ProductService {
	@Autowired
	ProductRepository repo;

	@Override
	public void addProduct(Product prod) {
		repo.save(prod);
	}

	@Override
	public Product searchProduct(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	@Override
	public void updateProduct(Product prod) {
		repo.save(prod);
	}

	@Override
	public void deleteProduct(Long id) {
		repo.deleteById(id);
	}

}
