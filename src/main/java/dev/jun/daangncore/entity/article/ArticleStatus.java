package dev.jun.daangncore.entity.article;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ArticleStatus {
    SALE("판매중"),
    RESERVED("예약중"),
    SOLD("판매완료");

    private final String description;
}
