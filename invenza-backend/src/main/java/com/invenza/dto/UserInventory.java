package com.invenza.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_inventory")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInventory {

    @EmbeddedId
    private UserInventoryId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("inventoryId")
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role {
        OWNER, EDITOR, VIEWER
    }
}
