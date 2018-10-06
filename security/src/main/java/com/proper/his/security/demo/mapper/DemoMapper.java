package com.proper.his.security.demo.mapper;

import com.proper.his.security.demo.entity.DemoEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DemoMapper {

    @Select("select * from test")
    List<DemoEntity> getAllTests();

    @Select("select * from test where id = #{id}")
    DemoEntity getTestById(String id);

    @Insert("insert into test(id, name, password, test_type) values(#{id}, #{name}, #{password}, #{testType})")
    int insertTest(DemoEntity testEntity);

    @Update("update test set name = #{name}, password = #{password}, test_type = #{testType} where id = #{id}")
    int updateTest(DemoEntity testEntity);

    @Delete("delete from test where id = #{id}")
    int deleteTestById(String id);
}
