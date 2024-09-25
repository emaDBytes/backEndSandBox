package com.e_codes.hello_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloThymeleafController {

    // This method handles GET requests to the /hello path.
    // It accepts two query parameters: "name" and "age".
    // These parameters are mapped using the @RequestParam annotation.
    @GetMapping("/hello")
    public String sayHello(@RequestParam String name, @RequestParam int age, Model model) {

        // Adding the "name" and "age" parameters to the model, 
        // so they can be accessed in the Thymeleaf template.
        model.addAttribute("name", name);
        model.addAttribute("age", age);

        // Return the name of the Thymeleaf template (hello.html) to be rendered.
        return "hello";
    }
}
