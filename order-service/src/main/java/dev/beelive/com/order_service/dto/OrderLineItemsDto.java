package dev.beelive.com.order_service.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderLineItemsDto {

    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
