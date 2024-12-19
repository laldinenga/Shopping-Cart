package com.ladinenga.ShopCart.service.order;

import com.ladinenga.ShopCart.dto.OrderDto;
import com.ladinenga.ShopCart.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
