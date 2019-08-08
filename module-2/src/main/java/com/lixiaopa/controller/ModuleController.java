package com.lixiaopa.controller;


import com.lixiaopa.entity.ConmonsEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ModuleController {

    @RequestMapping("m2")
    public Object method(){
        ConmonsEntity entity = ConmonsEntity.builder()
                .name("m2")
                .no("1")
                .like("m1")
                .build();

        return entity;
    }
}
