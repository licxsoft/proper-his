package com.proper.his.security;

import com.proper.his.core.TestEntity;
import com.proper.his.core.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public int home() {
        List<TestEntity> list = testService.getAllTests();
        return list.size();
    }
}
