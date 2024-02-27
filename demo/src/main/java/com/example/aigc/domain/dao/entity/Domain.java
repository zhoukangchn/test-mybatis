package com.example.aigc.domain.dao.entity;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Domain {
    private String id;

    private String name;

    private LocalDateTime crateTime;

    private LocalDateTime updateTime;

    private String userId;

    private Integer desc;
}