package com.invenza.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemRequestDTO {

    @NotBlank(message = "Item name is required")
    private String name;

    @Min(value = 0, message = "Quantity cannot be negative")
    private Integer quantity;

    private String unit;
    private LocalDate expiryDate;
    private LocalDate purchaseDate;

    @NotNull(message = "Inventory ID is required")
    private Long inventoryId;

    private Long categoryId;
    private String imageUrl;
    private String barcode;
}
