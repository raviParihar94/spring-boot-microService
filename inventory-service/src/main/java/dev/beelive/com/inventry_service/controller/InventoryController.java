package dev.beelive.com.inventry_service.controller;

import dev.beelive.com.inventry_service.dto.InventoryResponseDto;
import dev.beelive.com.inventry_service.service.InventoryService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@AllArgsConstructor
@Slf4j
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponseDto> isInStock(@RequestParam List<String> skuCode){
       log.info("received Inventory check request for skuCode {}", skuCode);
       return inventoryService.isInStock(skuCode);
    }
}
