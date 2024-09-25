package com.e_code.hellostudents;

import com.e_code.hellostudents.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/helloall")
    public String showStudents(Model model) {
        // Create a list of Student objects
        List<Student> students = new ArrayList<>();

        // Add some students to the list
        students.add(new Student("John", "Doe"));
        students.add(new Student("Jane", "Smith"));
        students.add(new Student("Emily", "Johnson"));

        // Add the student list to the model
        model.addAttribute("students", students);

        // Return the name of the view (Thymeleaf template)
        return "studentlist";
    }
}