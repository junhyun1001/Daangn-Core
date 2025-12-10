package dev.jun.daangncore.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Test {
    private long userId;
    private String userName;
    private int userAge;
    private LocalDateTime createdAt;
}
