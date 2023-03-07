package com.cts.ecommercebackend.dto;

import com.cts.ecommercebackend.entity.Address;
import com.cts.ecommercebackend.entity.Customer;
import com.cts.ecommercebackend.entity.Order;
import com.cts.ecommercebackend.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
