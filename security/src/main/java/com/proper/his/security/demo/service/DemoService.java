package com.proper.his.security.demo.service;

import com.proper.his.security.demo.entity.DemoEntity;

import java.util.List;

public interface DemoService {

    List<DemoEntity> getAllTests();

    DemoEntity getTestById(String id);

    int insertTest(DemoEntity demoEntity);

    int updateTest(DemoEntity demoEntity);

    int deleteTestById(String id);
}
