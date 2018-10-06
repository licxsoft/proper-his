package com.proper.his.core;

import com.proper.his.core.mapper.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    @Transactional
    public List<TestEntity> getAllTests() {
        return testDao.getAllTests();
    }
}
