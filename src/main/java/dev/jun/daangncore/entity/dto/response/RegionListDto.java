package dev.jun.daangncore.entity.dto.response;

import dev.jun.daangncore.entity.Region;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RegionListDto {

    private Long id;
    private String fullRegionName; // 예: 서울특별시 종로구 청운동

    public RegionListDto(Region region) {
        this.id = region.getId();
        this.fullRegionName = String.format("%s %s %s %s %s",
                region.getSido(),
                region.getSigungu() != null ? region.getSigungu() : "",
                region.getEupmyeondonggu() != null ? region.getEupmyeondonggu() : "",
                region.getEupmyeonridong() != null ? region.getEupmyeonridong() : "",
                region.getRi() != null ? region.getRi() : ""
                ).trim().replaceAll("\\s+", " ");
    }
}
