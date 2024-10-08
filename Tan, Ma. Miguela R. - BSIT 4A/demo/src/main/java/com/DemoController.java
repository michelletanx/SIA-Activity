package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class DemoController {

    @GetMapping("/api/hello")
    public String sayHello (@RequestParam(value = "name", defaultValue = "world") String name) {
        return "Hello, " + name + "!";
    }
    
}
