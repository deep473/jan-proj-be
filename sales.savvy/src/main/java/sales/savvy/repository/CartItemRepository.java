package sales.savvy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sales.savvy.entity.CartItem;

import java.util.Optional;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    Optional<CartItem> findByCartIdAndProdId(Long cartId, Long prodId);
}
