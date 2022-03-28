package com.hendisantika.controller;

import com.hendisantika.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * Created by IntelliJ IDEA.
 * Project : student-crud-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/03/22
 * Time: 06.48
 */
@Controller
public class TestController {
    @GetMapping("/test1")
    public String getForm(Student student) {
        return "index2";
    }

    @PostMapping("/save-student")
    public String submitStudentDetails(@Valid Student student, Errors errors, Model model) {
        if (null != errors && errors.getErrorCount() > 0) {
            return "index2";
        } else {
            model.addAttribute("successMsg", "Details saved successfully!!");
            return "success";
        }
    }
}
