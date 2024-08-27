package com.neemroz.ecommerce.controller;

import com.neemroz.ecommerce.model.Cart;
import com.neemroz.ecommerce.model.Product;
import com.neemroz.ecommerce.service.CartService;
import com.neemroz.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Cart getCart(@PathVariable Long id) {
        return cartService.getCart(id);
    }

    @PostMapping("/{cartId}/add/{productId}")
    public Cart addProductToCart(@PathVariable Long cartId, @PathVariable Long productId) {
        Product product = productService.getProductById(productId);
        cartService.addProductToCart(cartId, product);
        return cartService.getCart(cartId);
    }

    @PostMapping("/{cartId}/remove/{productId}")
    public Cart removeProductFromCart(@PathVariable Long cartId, @PathVariable Long productId) {
        Product product = productService.getProductById(productId);
        cartService.removeProductFromCart(cartId, product);
        return cartService.getCart(cartId);
    }
}
