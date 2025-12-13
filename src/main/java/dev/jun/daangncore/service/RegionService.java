package dev.jun.daangncore.service;

import dev.jun.daangncore.entity.dto.response.RegionListDto;
import dev.jun.daangncore.repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RegionService {

    private final RegionRepository regionRepository;

    public List<RegionListDto> findNearestRegions(BigDecimal lat, BigDecimal lon) {

        Pageable topTen = PageRequest.of(0, 20);

        return regionRepository.findNearestRegions(lat, lon, topTen).stream()
                .map(RegionListDto::new)
                .collect(Collectors.toList());
    }
}
