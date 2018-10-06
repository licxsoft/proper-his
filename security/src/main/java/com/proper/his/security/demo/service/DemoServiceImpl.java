package com.proper.his.security.demo.service;

import com.proper.his.security.demo.entity.DemoEntity;
import com.proper.his.security.demo.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public List<DemoEntity> getAllTests() {
        return demoMapper.getAllTests();
    }

    @Override
    public DemoEntity getTestById(String id) {
        return demoMapper.getTestById(id);
    }

    @Override
    public int insertTest(DemoEntity demoEntity) {
        return demoMapper.insertTest(demoEntity);
    }

    @Override
    public int updateTest(DemoEntity demoEntity) {
        return demoMapper.updateTest(demoEntity);
    }

    @Override
    public int deleteTestById(String id) {
        return demoMapper.deleteTestById(id);
    }
}
