package dev.jun.daangncore.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "regions")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @Column(nullable = false, length = 7)
    private String sido;

    @Column(length = 8)
    private String sigungu;

    @Column(length = 7)
    private String eupmyeondong;

    @Column(length = 8)
    private String ri;
}
