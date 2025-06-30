package sales.savvy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sales.savvy.entity.Product;

public interface ProductRepository 
		extends JpaRepository<Product, Long>{

}
