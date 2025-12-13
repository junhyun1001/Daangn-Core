package dev.jun.daangncore.controller;

import dev.jun.daangncore.entity.dto.response.RegionListDto;
import dev.jun.daangncore.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/regions")
@RequiredArgsConstructor
public class RegionController {

    private final RegionService regionService;

    @GetMapping("/nearest")
    public ResponseEntity<List<RegionListDto>> getNearestRegions(
            @RequestParam BigDecimal lat,
            @RequestParam BigDecimal lon) {

        List<RegionListDto> regions = regionService.findNearestRegions(lat, lon);
        return ResponseEntity.ok(regions);
    }


}
