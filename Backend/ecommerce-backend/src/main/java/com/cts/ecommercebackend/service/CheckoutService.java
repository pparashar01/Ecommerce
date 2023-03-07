package com.cts.ecommercebackend.service;

import com.cts.ecommercebackend.dto.Purchase;
import com.cts.ecommercebackend.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
