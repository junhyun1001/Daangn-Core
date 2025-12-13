package dev.jun.daangncore.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "members")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 50)
    private String nickname;

    @Column(nullable = false)
    private Double score;

    @Column(nullable = false)
    private Integer reviewCount;

    private String profileImageUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;

    @OneToMany(mappedBy = "member")
    private List<Favorite> favorites = new ArrayList<>();

    @Builder
    public Member(String email, String password, String nickname, String profileImageUrl, Region region) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.region = region;
        this.score = 36.5;
        this.reviewCount = 0;
    }
}
