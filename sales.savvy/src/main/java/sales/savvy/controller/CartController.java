package sales.savvy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sales.savvy.dto.CartData;
import sales.savvy.dto.CartItemDTO;
import sales.savvy.service.CartService;

import java.util.List;

@CrossOrigin("*")
@RestController
public class CartController {
    @Autowired private CartService cartService;

    @PostMapping("/addToCart")
    public String addToCart(@RequestBody CartData data) {
        cartService.addToCart(data);
        return "success";
    }

    @PostMapping("/updateCartItem")
    public String updateCartItem(@RequestBody CartData data) {
        cartService.updateCartItem(data);
        return "success";
    }

    @GetMapping("/viewCart")
    public List<CartItemDTO> viewCart(@RequestParam String username) {
        return cartService.getCartItems(username);
    }
}
