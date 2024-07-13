package dev.beelive.com.inventry_service.service;

import dev.beelive.com.inventry_service.dto.InventoryResponseDto;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional(readOnly = false)
public interface InventoryService {

    public List<InventoryResponseDto> isInStock(List<String> skuCode);

}
