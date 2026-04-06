package com.invenza.repository;

import com.invenza.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    // Get all items in an inventory
    List<Item> findByInventory_InventoryId(Long inventoryId);

    // Get items by category within an inventory
    List<Item> findByInventory_InventoryIdAndCategory_CategoryId(Long inventoryId, Long categoryId);

    // Expiry tracking — core for the health dashboard
    List<Item> findByInventory_InventoryIdAndExpiryDateBefore(Long inventoryId, LocalDate date);
    List<Item> findByInventory_InventoryIdAndExpiryDateBetween(Long inventoryId, LocalDate start, LocalDate end);

    // Barcode lookup
    Optional<Item> findByBarcode(String barcode);

    // Items expiring within N days (for smart notifications)
    @Query("SELECT i FROM Item i WHERE i.inventory.inventoryId = :inventoryId " +
            "AND i.expiryDate BETWEEN CURRENT_DATE AND :cutoffDate")
    List<Item> findItemsExpiringSoon(
            @Param("inventoryId") Long inventoryId,
            @Param("cutoffDate") LocalDate cutoffDate
    );
}
