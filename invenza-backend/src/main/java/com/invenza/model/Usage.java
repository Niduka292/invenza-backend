package com.invenza.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "usage")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usageId;

    private Integer quantity;

    private LocalDate dateUsed;

    @ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;
}
