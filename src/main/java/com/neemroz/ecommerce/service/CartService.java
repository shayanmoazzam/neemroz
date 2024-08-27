package com.neemroz.ecommerce.service;

import com.neemroz.ecommerce.model.Cart;
import com.neemroz.ecommerce.model.Product;
import com.neemroz.ecommerce.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Cart getCart(Long id) {
        return cartRepository.findById(id).orElse(new Cart());
    }

    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public void addProductToCart(Long cartId, Product product) {
        Cart cart = getCart(cartId);
        cart.addProduct(product);
        saveCart(cart);
    }

    public void removeProductFromCart(Long cartId, Product product) {
        Cart cart = getCart(cartId);
        cart.removeProduct(product);
        saveCart(cart);
    }
}
