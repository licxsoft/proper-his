package com.proper.his.core.mapper;

import com.proper.his.core.TestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestDao {

    @Select("select * from test")
    public List<TestEntity> getAllTests();
}
