package com.invenza.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryResponseDTO {

    private Long inventoryId;
    private String name;
    private LocalDateTime createdAt;
    private List<UserInventoryResponseDTO> members;
}
