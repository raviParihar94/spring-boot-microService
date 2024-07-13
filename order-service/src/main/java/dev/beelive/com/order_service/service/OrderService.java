package dev.beelive.com.order_service.service;

import dev.beelive.com.order_service.dto.OrderRequest;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public interface OrderService {
    public String placeOrder(OrderRequest orderRequest);
}
