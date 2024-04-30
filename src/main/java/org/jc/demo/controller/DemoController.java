package org.jc.demo.controller;

import org.jc.demo.domain.DemoBean;
import org.jc.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;
    @GetMapping("/hello")
    public DemoBean getDemo() {
        DemoBean demoBean = demoService.parseData();
        return demoBean;
    }
}
