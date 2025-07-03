package sales.savvy.service;

import java.util.List;

import sales.savvy.dto.CartData;
import sales.savvy.dto.CartItemDTO;

public interface CartService {
	void addToCart(CartData data);
	void updateCartItem(CartData data);
	List<CartItemDTO> getCartItems(String username);
}
