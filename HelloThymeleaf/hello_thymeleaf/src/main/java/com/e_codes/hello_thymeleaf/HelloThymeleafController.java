package com.e_codes.hello_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloThymeleafController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name, @RequestParam int age, Module modle) {

        modle.addAttribute("name", name);
        modle.addAttribute("age", age);

        return "hello";
    }
}
