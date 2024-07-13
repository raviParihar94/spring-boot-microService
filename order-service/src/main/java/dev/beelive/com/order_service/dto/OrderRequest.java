package dev.beelive.com.order_service.dto;


import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {
    List<OrderLineItemsDto> orderLineItemsDtoList ;
}
