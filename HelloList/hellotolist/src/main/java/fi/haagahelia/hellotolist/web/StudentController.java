package fi.haagahelia.hellotolist.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fi.haagahelia.hellotolist.domain.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/hello")
    public String hello(Model model) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe"));
        students.add(new Student("Jane", "Smith"));
        students.add(new Student("Michael", "Johnson"));

        model.addAttribute("message", "Welcome to the Student List!");
        model.addAttribute("students", students);

        return "hello";
    }
}
