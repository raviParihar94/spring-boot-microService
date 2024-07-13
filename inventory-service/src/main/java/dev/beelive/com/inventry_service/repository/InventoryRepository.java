package dev.beelive.com.inventry_service.repository;

import dev.beelive.com.inventry_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long> {

  // Optional<Inventory> findBySkuCode(String scuCode);
  Optional<Inventory> findBySkuCodeIn(List<String> scuCodes);
}
