package com.ladinenga.ShopCart.service.cart;

import com.ladinenga.ShopCart.model.Cart;
import com.ladinenga.ShopCart.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
}
