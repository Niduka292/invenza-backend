package com.invenza.dto;

import com.invenza.model.UserInventory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInventoryResponseDTO {

    private Long userId;
    private String userName;
    private Long inventoryId;
    private String inventoryName;
    private UserInventory.Role role;
}
