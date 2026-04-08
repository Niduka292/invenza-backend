package com.invenza.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ItemResponseDTO {

    private Long itemId;
    private String name;
    private Integer quantity;
    private String unit;
    private LocalDate expiryDate;
    private LocalDate purchaseDate;
    private Long inventoryId;
    private CategoryResponseDTO category;
    private String imageUrl;
    private String barcode;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Computed fields for the Health Dashboard
    private ExpiryStatus expiryStatus;
    private Long daysUntilExpiry;

    public enum ExpiryStatus {
        FRESH,       // > 7 days
        NEAR_EXPIRY, // 3–7 days
        URGENT,      // < 3 days
        EXPIRED      // past expiry date
    }
}
