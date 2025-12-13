package dev.jun.daangncore.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "regions")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @Column(nullable = false, length = 10)
    private String sido; // 시도

    @Column(length = 10)
    private String sigungu; // 시군구

    @Column(length = 30)
    private String eupmyeondonggu; // 읍면동/구

    @Column(length = 30)
    private String eupmyeonridong; // 읍/면/리/동

    @Column(length = 10)
    private String ri; // 리

    // 위도: 전체 10자리, 소수점 7자리
    @Column(precision = 10, scale = 7)
    private BigDecimal latitude;

    // 경도: 전체 11자리, 소수점 7자리
    @Column(precision = 11, scale = 7)
    private BigDecimal longtitude;
}
