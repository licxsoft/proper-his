package com.proper.his.security;

import com.proper.his.core.TestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String home() {
        TestEntity t = new TestEntity();
        t.setId("TEST");
        return t.getId();
    }
}
