package com.proper.his.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TestService {

    List<TestEntity> getAllTests();
}
