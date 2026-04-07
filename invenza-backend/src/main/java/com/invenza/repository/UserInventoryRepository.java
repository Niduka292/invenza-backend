package com.invenza.repository;

import com.invenza.model.UserInventory;
import com.invenza.model.UserInventoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserInventoryRepository extends JpaRepository<UserInventory, UserInventoryId> {

    // All inventories a user belongs to
    List<UserInventory> findByUser_UserId(Long userId);

    // All members of an inventory
    List<UserInventory> findByInventory_InventoryId(Long inventoryId);

    // Check if a user has access to a specific inventory
    boolean existsByUser_UserIdAndInventory_InventoryId(Long userId, Long inventoryId);

    // Find by role — useful for permission checks
    Optional<UserInventory> findByUser_UserIdAndInventory_InventoryId(Long userId, Long inventoryId);

    List<UserInventory> findByInventory_InventoryIdAndRole(Long inventoryId, UserInventory.Role role);
}
