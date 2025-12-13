package dev.jun.daangncore.repository;

import dev.jun.daangncore.entity.Region;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {

    /**
     * 내 위치(lat, lon)를 기준으로 반경 5km 내의 지역들을 가져옴
     */
    @Query(value = """
    SELECT * FROM (
        SELECT r.*,
               (6371 * ACOS(
                   COS(RADIANS(:myLat)) * COS(RADIANS(latitude))
                   * COS(RADIANS(longitude) - RADIANS(:myLon))
                   + SIN(RADIANS(:myLat)) * SIN(RADIANS(latitude))
               )) AS DISTANCE
        FROM REGIONS r
    )
    WHERE DISTANCE < 5
    ORDER BY DISTANCE ASC
    """, nativeQuery = true)
    List<Region> findNearestRegions(@Param("myLat") BigDecimal myLat,
                                   @Param("myLon") BigDecimal myLon,
                                   Pageable pageable);
}
