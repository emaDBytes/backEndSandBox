package fi.haagahelia.course.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @ResponseBody
    @RequestMapping("/hi")
    public String hello(@RequestParam(name = "firstname", required = false) String firstName,
            @RequestParam(name = "lastname", required = false) String lastName) {

        return "Hello " + (firstName != null ? firstName : "") + " " + (lastName != null ? lastName : "") + "!";
    }
}