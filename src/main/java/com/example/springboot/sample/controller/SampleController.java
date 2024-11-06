package com.example.springboot.sample.controller;

import com.example.springboot.sample.entity.SampleBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @GetMapping(path = "/getMessage1")
    public String sample1() {
        return "Hello World";
    }

    @GetMapping(path = "/getMessage2")
    public SampleBean sample2() {
        return new SampleBean("Hello World");
    }

    @GetMapping(path = "/getMessage3/{name}")
    public SampleBean sample3(@PathVariable String name) {
        return new SampleBean(String.format("Hello World, %s", name));
    }
}
