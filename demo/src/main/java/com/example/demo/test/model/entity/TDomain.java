package com.example.demo.test.model.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author abc
 * @since 2024-02-23
 */
@Data
public class TDomain implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private LocalDateTime crateTime;

    private LocalDateTime updateTime;

    private String userId;

}
