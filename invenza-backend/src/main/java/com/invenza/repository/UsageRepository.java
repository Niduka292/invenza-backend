package com.invenza.repository;

import com.invenza.model.Usage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface UsageRepository extends JpaRepository<Usage, Long> {

    List<Usage> findByItem_ItemId(Long itemId);

    // For burn rate calculation (Pandas-style analytics on the Java side)
    List<Usage> findByItem_ItemIdAndDateUsedBetween(Long itemId, LocalDate start, LocalDate end);

    // Total quantity consumed for an item
    @Query("SELECT SUM(u.quantity) FROM Usage u WHERE u.item.itemId = :itemId")
    Integer sumQuantityByItemId(@Param("itemId") Long itemId);

    // Average daily usage — feeds into predictive consumption engine
    @Query(value = "SELECT SUM(u.quantity) * 1.0 / NULLIF(DATEDIFF(MAX(u.date_used), MIN(u.date_used)), 0) " +
            "FROM usage u WHERE u.item_id = :itemId",
            nativeQuery = true)
    Double findAverageDailyUsage(@Param("itemId") Long itemId);
}
