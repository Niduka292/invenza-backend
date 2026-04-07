package com.invenza.dto;

import com.invenza.model.UserInventory;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInventoryRequestDTO {

    @NotNull(message = "User ID is required")
    private Long userId;

    @NotNull(message = "Inventory ID is required")
    private Long inventoryId;

    @NotNull(message = "Role is required")
    private UserInventory.Role role;
}
