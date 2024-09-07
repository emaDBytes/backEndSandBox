package fi.haagahelia.course.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }

    @RequestMapping("/index")
    public @ResponseBody String mainPage() {
        return "This is the main page";
    }

    @RequestMapping("/contact")
    public @ResponseBody String contactUs() {
        return "This is the contact page";
    }

}