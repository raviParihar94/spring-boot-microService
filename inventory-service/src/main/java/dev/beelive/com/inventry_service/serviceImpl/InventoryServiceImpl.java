package dev.beelive.com.inventry_service.serviceImpl;

import dev.beelive.com.inventry_service.dto.InventoryResponseDto;
import dev.beelive.com.inventry_service.repository.InventoryRepository;
import dev.beelive.com.inventry_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {
    private final InventoryRepository inventoryRepository;

    @Override
    public List<InventoryResponseDto> isInStock(List<String> skuCode) {
        return inventoryRepository.findBySkuCodeIn(skuCode).stream()
                        .map(inventory ->
                              InventoryResponseDto.builder()
                                     .skuCode(inventory.getSkuCode())
                                     .isInStock(inventory.getQuantity()>0)
                                    .build()
                        ).toList();
    }
}
