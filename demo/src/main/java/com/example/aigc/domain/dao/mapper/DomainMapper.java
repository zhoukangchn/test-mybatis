package com.example.aigc.domain.dao.mapper;

import com.example.aigc.domain.dao.entity.Domain;
import java.util.List;

public interface DomainMapper {
    int insert(Domain row);

    List<Domain> selectAll();
}