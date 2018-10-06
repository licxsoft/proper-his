package com.proper.his.security.demo.controller;

import com.proper.his.security.demo.entity.DemoEntity;
import com.proper.his.security.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/security")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/demos")
    @ResponseBody
    public List<DemoEntity> getDemos() {
        return demoService.getAllTests();
    }

    @GetMapping("/demos/{id}")
    @ResponseBody
    public DemoEntity getDemo(@PathVariable("id") String id) {
        return demoService.getTestById(id);
    }

    @PostMapping("/demos")
    public String saveDemo(@RequestBody DemoEntity demoEntity) {
        demoEntity.setId(UUID.randomUUID().toString());
        demoService.insertTest(demoEntity);
        return demoEntity.getId();
    }

    @PutMapping("/demos/{id}")
    public int updateDemo(@RequestBody DemoEntity demoEntity) {
        return demoService.updateTest(demoEntity);
    }

    @DeleteMapping("/demos/{id}")
    public int deleteDemo(@PathVariable("id") String id) {
        return demoService.deleteTestById(id);
    }
}
