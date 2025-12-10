package dev.jun.daangncore.mapper;

import dev.jun.daangncore.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

    List<Test> findAll();
}
